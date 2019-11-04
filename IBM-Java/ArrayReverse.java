// IBM - Exercise 7

import java.util.Arrays;

// Reserve the elements in the array var and place in the array reverseVar

class ArrayReverse{
    public static void main(String[] args) {
        System.out.println("Declare and initialize an array");
        int[] var = new int[5];
        for (int i=0; i< var.length ; i ++ ) {
            var[i] = i;
        }
        // print int[] array 
        System.out.println(Arrays.toString(var));

        int[]reverseVar = new int[5];
        
        for(int i = 0 ; i < reverseVar.length ; i++ ) {
            reverseVar[i] = var[reverseVar.length - i - 1];
        }

        // print reverseVar[]
        System.out.println(Arrays.toString(reverseVar));
    }
}