package exercise;


import java.util.Map;
import java.util.List;

// BEGIN
public class Sorter {
    public static List<Map<String, String>> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted((user1, user2) -> user1.get("birthday").compareTo(user2.get("birthday")))
                .map(user -> user.get("name"))
                .toList();
    }
}

// END
