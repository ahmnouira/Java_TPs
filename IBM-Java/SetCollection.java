// A set is a collection that conatains unique elements that is no duplication 

// --> set ensures uniqueness, Not order

import java.util.HashSet;
import java.util.Set;

public class SetCollection{

    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<Integer>();
        // add()
        ints.add(Integer.valueOf(2));
        ints.add(Integer.valueOf(10));
        ints.add(Integer.valueOf(10));
        ints.add(Integer.valueOf(20));
        ints.add(Integer.valueOf(5));
        ints.add(100);

        System.out.println();
        for(Integer i: ints) {
            System.out.println(i);
        }
        
        System.out.println();
        // constains()
        System.out.println(ints.contains(10));
        System.out.println(ints.contains(50));

        System.out.println();
        // remove()
        ints.remove(100);
        System.out.println(ints);
        System.out.println(ints.toString());

        System.out.println();
        // isEmpty()
        System.out.println(ints.isEmpty());
    }
 
 }

