package assignment_codes;

import java.util.Date;


class GeometricObject {
    private String color;
    private boolean filled;
    private Date date;

    public GeometricObject() {
        this.color= "white";
        this.filled =false;
        this.date =new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color =color;
        this.filled =filled;
        this.date =new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return date;
    }

    public String toString() {
        return "GeometricObject created on "+date+"\nColor: "+color+",Filled: "+filled;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c, f);
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + getArea());
        System.out.println("Circle Perimeter: " + getPerimeter());
        System.out.println("Circle Diameter: " + getDiameter());
    }
}


class Rectangle extends GeometricObject {
    private double h;
    private double w;

    public Rectangle() {
        this.h = 1.0;
        this.w = 1.0;
    }

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public Rectangle(double h, double w, String c, boolean f) {
        super(c, f);
        this.w = w;
        this.h = h;
    }

    public double getWidth() {
        return w;
    }

    public void setWidth(double w) {
        this.w = w;
    }

    public double getHeight() {
        return h;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    public double getArea() {
        return w * h;
    }

    public double getPerimeter() {
        return 2 * (w + h);
    }
}

public class qus13 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", true);
        System.out.println(circle.toString());
        circle.printCircle();

        System.out.println();
        Rectangle rectangle = new Rectangle(4.0, 7.0, "Blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}

