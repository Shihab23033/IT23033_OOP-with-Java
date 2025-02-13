import java.util.Scanner;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        try {
            Scanner sc=new Scanner(System.in);
            double r = sc.nextDouble();
            circle.setRadius(r); 
            System.out.println("Area: " + circle.getArea());
            sc.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}