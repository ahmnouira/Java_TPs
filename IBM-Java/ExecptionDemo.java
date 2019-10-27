public class ExecptionDemo{

     public static void main(String[] args) {
        int num [] = {1, 2, 3, 4, 5};
        int number1 = 200;
        int number2 = 0;
        
        // java.lang.ArrayIndexOutOfBoundsException: 10
        try {
             System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of range");
                                    
        }finally {

        }

        // java.lang.ArithmeticException: / by zero
        try {
             int result = number1 /number2; 
             System.out.println("The result of " + number1 + " divided by " + number2 + " is " + result);
					
        } catch(ArithmeticException ex) {
             System.out.println(ex);
        }

        }

}