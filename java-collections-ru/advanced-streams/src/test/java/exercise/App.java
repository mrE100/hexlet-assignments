package exercise;

import java.util.List;

public class App {
    public static String getForwardedVariables(String environment) {
        StringBuilder builder = new StringBuilder();
        List<String> strings = environment.split("\n");
        strings = strings.stream()
                .filter(string -> string.contains("environment"))
                .spliterator(",");
        for (String string : strings) {
            if (string.startsWith("X_FORWARDED_")) {
                builder.append(string.replace("X_FORWARDED_", ""));
            }
        }
        return builder.toString();
    }
}
