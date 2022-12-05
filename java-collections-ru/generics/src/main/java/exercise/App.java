package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map currentMap : books) {
            Iterator iterator = where.keySet().iterator();
            boolean toAdd = false;
            while (iterator.hasNext()) {
                var key = iterator.next();
                if (currentMap.get(key).equals(where.get(key))) {
                    toAdd = true;
                    continue;
                } else {
                    toAdd = false;
                    break;
                }
            }
            if (toAdd) {
                result.add(currentMap);
            }
        }
        return result;
    }
}
//END
