package exercise;

import java.util.*;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        Set<String> keys = new HashSet<>(storage.toMap().keySet());
        Map oldMap = storage.toMap();

        for (String key : keys) {
            String value = (String) oldMap.get(key);
            storage.unset(key);
            storage.set(value, key);
        }
    }

    public static void main (String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        System.out.println(storage.toMap());
        App.swapKeyValue(storage);
        System.out.println(storage.toMap());
        storage.get("key", "default"); // "default"
        storage.get("value", "default"); // "key"

        System.out.println(storage.toMap());
        KeyValueStorage storage1 = new FileKV("src/test/resources/file", Map.of("key", "value"));
        storage1.get("key", "default");
    }
}

// END
