
public class Collections {

    public static void main(String[] args) {

        // empty intergers array
        int[] integers = new int[100];

        //  initialized integers array 
        int[] integers_init = new int[] { 1, 2, 3, 4, 5 };
        // or
        int [] integers_init_v2 = {0, 1, 2, 3, 4};

        for(int aa=0; aa <integers.length ; aa++) {
            integers[aa] = aa + 1;
        }

        System.out.println(integers);
        System.out.println(integers_init);

        // Loading an array 

       /* Logger l = Logger.getLogger("Test");

        for(int i : integers) {
            l.info("This little integger value" + integers[i]);
        } */

        String[] names = new String[3];
        names[0] = "Ahmed";
        names[1] = "Mahmoud";
        names[2] = "Salha";

        for(String n : names) {
            System.out.println(n);
        }


        // Multi-Dimensional Arrays 
        String[][] StudentNames = new String[3][3];  //  0 -- > 2

        // firstName - LastName - Email 

        StudentNames[0][0] = "Ahmed";
        StudentNames[0][1] = "Nouira";

        StudentNames[1][0] = "Mahmoud";
        StudentNames[1][1] = "Nouira";

        StudentNames[2][0] = "Alex";
        StudentNames[2][1] = "Mario";

        System.out.println("All First Names:");  // first col
        for(int i = 0; i < StudentNames.length; i++) {
           System.out.println(StudentNames[i][0]);
        }

        System.out.println("All Last Names: ");
        for(String[] n: StudentNames) {
            System.out.println(n[1]);
        }
 
        
    }
}