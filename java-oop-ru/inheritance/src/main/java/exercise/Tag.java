package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    String name;
    Map data;

    public Tag(String name, Map data) {
        this.name = name;
        this.data = data;
    }

    public String toString() {
        String mapToString = mapTostring();
        return String.format("<%s%s>", this.name, mapToString);
    }

    private String mapTostring() {
        StringBuilder builder = new StringBuilder();
        if (data != null && !data.isEmpty()) {
            for (var key: data.keySet()){
                builder.append(String.format(" %s=\"%s\"", key, data.get(key)));
            }
        }
        return builder.toString();
    }

}
// END
