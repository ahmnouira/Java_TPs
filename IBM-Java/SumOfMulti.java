/* A while loop to print the sum of numbers that are multiples of 3 and 5 below the maxNum */
/**
 * SumOfMulti
 */
public class SumOfMulti {

    public static void main(String[] args) {
        
        int maxNb = 100;
        int sum = 0;
        while(maxNb > 0) {

            if  (maxNb % 5 == 0 && maxNb % 3 == 0) {
                sum += maxNb; 
            }

            maxNb -- ;
        }

        System.out.println("sum : " + sum);
        
    }

  
}