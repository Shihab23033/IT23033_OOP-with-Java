package Circle_class;

import java.util.Scanner;

public class CircleMainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = scan.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        double area=circle.Area();
        System.out.println("Radious of the circle is: "+ circle.getRadius() );
        System.out.println("Area of the circle is " +area );
        scan.close();
    }
}
//shihab(IT-23033)