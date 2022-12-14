package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        ArrayList<String> list = new ArrayList<String>(data1.keySet());
        list.addAll(data2.keySet());
        Collections.sort(list);
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (String str : list) {
            if (data1.containsKey(str) && data2.containsKey(str)) {
                if (data1.get(str).equals(data2.get(str))) {
                    result.put(str, "unchanged");
                } else {
                    result.put(str, "changed");
                }
            }else if (data1.containsKey(str)) {
                result.put(str, "deleted");
            } else {
                result.put(str, "added");

            }
        }
        return result;
    }

}

//END
