package exercise;

import java.util.List;

public class App {
    public static String getForwardedVariables(String environment) {
        StringBuilder builder = new StringBuilder();
        List<String> strings = List.of(environment.split("\n"));
        strings = (List<String>) strings.stream()
                .filter(string -> string.contains("environment"))
                .filter(str -> str.contains("X_FORWARDED_"))
                .toList();
        for (String string : strings) {
            string = string.substring(string.indexOf("=\"") + 1).replaceAll("\"", "");
            List<String> list = List.of(string.split(","));
            for (String str : list) {
                if (str.startsWith("X_FORWARDED_")) {
                    builder.append(str.replace("X_FORWARDED_", ""));
                }
            }
        }
        return builder.toString();
    }
}
