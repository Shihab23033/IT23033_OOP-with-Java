package assignment_codes;
interface Edible {
    void howToEat();
}
abstract class Animal{
    abstract String sound();
}
class Tiger extends Animal{
    @Override
    public String sound(){
        return "Tiger roars";
    }
}
class Chicken extends Animal implements Edible{
    public String sound(){
        return "chicken chicks";
    }
    @Override
    public void howToEat(){
        System.out.println("Fry it or make Chicken curry");
    }
}
abstract class Fruit implements Edible{ }
class Apple extends Fruit{
    @Override
    public void howToEat(){
        System.out.println("eat it raw or make apple juice");
    }
}
class Orange extends Fruit{
    @Override
    public void howToEat(){
        System.out.println("peel and eat");
    }
}

public class qus27 {
    public static void main(String[] args) {
        Tiger t= new Tiger();
        System.out.println(t.sound());
        Chicken ch= new Chicken();
        ch.howToEat();
        System.out.println(ch.sound());
        Fruit f;
        f=new Apple();
        f.howToEat();
        f=new Orange();
        f.howToEat();
    }
}
