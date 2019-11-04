import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class MapCollection {

    public static Map<String, Integer> createMap() {

        Map<String, Integer> map = new HashMap<>();
        // put()
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        return map;

    }

    public static void main(String[] args) {
        System.out.println();
        Map<String, Integer> map  = createMap();
        // get()
        System.out.println(map.get("four"));

        System.out.println(map);
        System.out.println(map.containsKey("one"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());;

        System.out.println();
        // for loop 
 
        for(Map.Entry nb : map.entrySet()) {
            System.out.println("Key: " + nb.getKey() +", Value: " + nb.getValue());
        }

        // using Iterator 
        System.out.println();
        Iterator it  = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry nb = (Map.Entry) it.next();
            System.out.println("key: " + nb.getKey() + ", Value: " + nb.getValue());
        }


        // adds keys of the map to a set 
        Set<String> keys = map.keySet();
        Logger l = Logger.getLogger("Test");
        System.out.println();
        for( String key : keys) {
            Integer value = map.get(key);
            l.info("value keyed by" + key + "is" + value);
        }
    }
}