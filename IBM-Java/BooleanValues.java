import java.util.Locale;

public class BooleanValues {


    public static int getHeight(int height) {
        int inc  = height;
        // if the current local is US do not use the metric systeme
        if (Locale.getDefault().equals(Locale.US)) {
            inc /= 2.54; // convert form cm to inches 
        }
        return inc;
    }
    public static void main(String[] args) {
        Boolean a = true;
        Boolean b = true;   
        int height = 172;
        System.out.println("Locale.getDefault() :" + Locale.getDefault());
        System.out.println(getHeight(height));
        System.out.println(a ==  b);
        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a != b );
    }
}