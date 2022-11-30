package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> result = new HashMap<>();
        if (!text.isEmpty()) {
            for (String word : text.toLowerCase().split(" ")) {
                if (result.containsKey(word)) {
                    int count = result.get(word) + 1;
                    result.put(word, count);
                } else {
                    result.put(word, 1);
                }
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (String word : map.keySet()) {
            builder.append("\n  ").append(word).append(": ").append(map.get(word));
        }
        builder.append("\n}");
        return builder.toString();
    }
}
//END
