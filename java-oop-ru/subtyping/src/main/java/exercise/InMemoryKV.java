package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> data;

    public InMemoryKV(Map data) {
        this.data = new HashMap<>(data);
    }


    @Override
    public void set(String key, String value) {
        if (this.data.containsKey(key)) {
            this.data.replace(key, value);
        } else {
            this.data.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        this.data.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (data.containsKey(key)) {
            return data.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
