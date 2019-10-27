public class StringMethods{
    
    public static void main(String[] args) {

        String firstName  = "Ahmed";
        String lastName = "Nouira";

        // length() 
        System.out.println("length of '" + firstName + "' : " + firstName.length());

        // charAt()
        System.out.println(".chartAt(0) of '" + firstName + "' : " + firstName.charAt(0));
        // -2 : String index out of the range 
        System.out.println(".chartAt(2) of '" + lastName + "' : " + lastName.charAt(2));

        // indexOf() : return the index position of the first occurance 
        System.out.println(".indexOf(oui) of '" + lastName + "' : " + lastName.indexOf("oui"));
        System.out.println(".indexOf(m) of '" + firstName + "': " + firstName.indexOf("m"));


        // replace() : replaces all the occurance of first sequence of character with second of character & return the value 
        firstName = firstName.replace("Ahmed", "Mahmoud");
        lastName = lastName.replace("N", "M");
        System.out.println(firstName);
        System.out.println(lastName);

        // substring()

        String subFirstName = firstName.substring(0, 3); // index 3 exlusive
        String subLastName = lastName.substring(1);

        System.out.println(subFirstName);
        System.out.println(subLastName);


        // conert Sting to Int

    
       

        
    }

}