package assignment_codes;

import java.util.Scanner;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        else
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class qus25 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc=new Scanner(System.in);
        try {
            double r = sc.nextDouble();
            circle.setRadius(r); 
            System.out.println("Area: " + circle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
        sc.close();
    }
}
