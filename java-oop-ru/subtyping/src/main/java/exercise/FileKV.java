package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;


    public FileKV(String path, Map<String, String> data) {
        this.path = path;
        Utils.writeFile(path, Utils.serialize(data));
    }

    @Override
    public void set(String key, String value) {
        Map data = Utils.unserialize(Utils.readFile(this.path));
        if (data.containsKey(key)) {
            data.replace(key, value);
        } else {
            data.put(key, value);
        }
        Utils.writeFile(this.path, Utils.serialize(data));
    }

    @Override
    public void unset(String key) {
        Map data = Utils.unserialize(Utils.readFile(this.path));
        data.remove(key);
        Utils.writeFile(this.path, Utils.serialize(data));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map data = Utils.unserialize(Utils.readFile(this.path));
        if (data.containsKey(key)) {
            return (String) data.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        Map data = Utils.unserialize(Utils.readFile(this.path));
        return data;
    }
}
// END
