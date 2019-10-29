// Find the area and circumference of circle 


public class Circle{

    private  double radius;

    public Circle() {

    } 

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return  2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }


    public static void main(String[] args) {

   
        Circle c1 = new Circle(5);
        System.out.println("Area of the Circle[" + c1.getRadius() + "] :" + c1.area());
        System.out.println("Circumference of the Circle[" + c1.getRadius() +"]: " + c1.circumference());
        System.out.println("Round Circumference :" + Math.round(c1.circumference()));
    }
    
}