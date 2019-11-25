import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Collections {


    public static final int a = 4;

    private static final int b = 5;

    public static Map<String, Integer> createMap(){
        Map<String, Integer> colors = new HashMap<String, Integer>();
        colors.put("red", 1);
        colors.put("yellow" , 2);
        colors.put("green" , 3);

        return colors;
    }


    public static List<Integer> createIntList() {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(5);
        integers.add(10);

        return integers;
    }



    public static void main(String[] args) {


        Map<String, Integer> map  = createMap();
        List<Integer> integers = createIntList();


        // after set elements
        System.out.println(integers);
        System.out.println(integers.get(1));
        integers.set(0, 20);
        // after update element
        System.out.println(integers);
        integers.remove(0);
        // after remove element
        System.out.println(integers.toString());
        for(Integer  i : integers) {
        System.out.println(i);


        for(Map.Entry color: map.entrySet()) {
            System.out.println("Key: " + color.getKey() + ", Value: " + color.getValue());
        }

        // using iterator 

         Iterator it = integers.iterator();

         while(it.hasNext()) {
             Integer myInt = (Integer)it.next();
             System.out.println(myInt);
         }
        }

        Iterator it2 = map.entrySet().iterator();
    }
}



/**
 * InnerCollections
 */
public class InnerCollections extends Collections {


    double x = Collections.a;

}


