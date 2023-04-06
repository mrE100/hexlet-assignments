package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List result = new ArrayList<>();

        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    if (field.get(address) == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e);
                }
            }
        }
        return result;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>>  result = new HashMap<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    if (field.get(address) == null) {
                        result.put(field.getName(), new ArrayList<>(Arrays.asList("can not be null")));
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e);
                }
            }
            if (field.isAnnotationPresent(MinLength.class)) {
                try {
                    int length = field.getAnnotation(MinLength.class).minLength();
                    if (field.get(address) == null || field.get(address).toString().length() < length) {
                        if (result.containsKey(field.getName())) {
                            List value = result.get(field.getName());
                            value.add(String.format("length less than %s", length));
                            result.put(field.getName(), value);
                        } else {
                        result.put(field.getName(), new ArrayList<>(Arrays.asList(String.format("length less than %s", length))));
                        }
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e);
                }
            }
        }
        return result;
    }
}
// END
