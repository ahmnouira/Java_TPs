import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsV2 {
    public static void main(String [] args) {
        
        List<String> listOfString = new ArrayList<String>();

        List<Integer> listOfIntegers = new ArrayList<>();

        // add()
        listOfIntegers.add(Integer.valueOf(238));
        listOfIntegers.add(Integer.valueOf(100));
        listOfIntegers.add(14);
        listOfIntegers.add(50);


        listOfString.add("Ahmed");
        listOfString.add("Mahmoud");


        //Add element at the given index
 
        /* Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 2 */
            // listOfString.add(5, "Alex");
        listOfString.add(2, "Alex");    
        listOfString.add(3, "Mahdi");


        /* no suitable method found for toString(List<Integer>) */
            // System.out.println(Arrays.toString(listOfIntegers));

        // Displaying ArratList elements           
        System.out.println(listOfString);
        System.out.println(listOfIntegers);

        // size()
        System.out.println(".size(): " + listOfIntegers.size());



        // get()

        System.out.println(".get(1): " +listOfIntegers.get(1));

        // remove()
        listOfString.remove(1);
        listOfString.remove("Mahdi");

        listOfIntegers.remove(3);


        // display v1
        System.out.println(listOfString);
        System.out.println(listOfIntegers);

        // display v2
        for(String i : listOfString) {
            System.out.println(i);

        }

        System.out.println();

        ArrayList<String> things = new ArrayList<String>();
        things.add("chair");
        things.add("PC");
        things.add("Table");
        Iterator it =  things.iterator(); 
        // display v3
        while(it.hasNext()) {
            String thing = (String)it.next();
            System.out.println(thing);
        }


    }
}