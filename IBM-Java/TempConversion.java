public class TempConversion {

    public static void main(String[] args) {
        System.out.println();

        int clesius = 100;
		// Using operators to convert from celsius to fahrenheit
		// To convert temperatures in degrees Celsius to Fahrenheit, multiply
		// //by 1.8 (or 9/5) and add 32.
        double fahrenhiet = clesius *  9/5 + 32;
        String message = "Clesius " + clesius + "°C is " + fahrenhiet + " F.";
        System.out.println(message);
        // To convert temperatures in degrees Fahrenheit to Celsius, subtract
		// //32 and multiply by .5556 (or 5/9).
		// And back to celsius to validate the answer
        double fahrenheitClesius = (fahrenhiet - 32) * 5/9;
        message = "Fahrenhiet " + fahrenhiet + "F is" + "Clesius " + fahrenheitClesius + "°C";
        System.out.println(message);
    }
}