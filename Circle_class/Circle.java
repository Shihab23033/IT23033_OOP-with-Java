package Circle_class;

public class Circle {
    private double radius;
    public Circle(){

    }
    public void setRadius(double radi){
        this.radius = radi;
    }
    public double getRadius(){
        return this.radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }
}
//shihab(IT23033)