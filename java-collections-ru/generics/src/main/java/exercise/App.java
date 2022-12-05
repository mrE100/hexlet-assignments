package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map currentMap : books) {
            List<String> keys = new ArrayList<>(where.keySet());
            if (currentMap.get(keys.get(0)).equals(where.get(keys.get(0)))){
                    if (currentMap.get(keys.get(1)).equals(where.get(keys.get(1)))){
                    result.add(currentMap);
                }
            }
        }
        return result;
    }
}
//END
