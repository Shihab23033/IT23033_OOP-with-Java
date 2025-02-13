// Define the Edible interface
interface Edible {
    String howToEat();
}

// Abstract Animal class
abstract class Animal {
    abstract String sound();
}

// Tiger class extending Animal
class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger roars";
    }
}

// Chicken class extending Animal and implementing Edible
class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Chicken clucks";
    }

    @Override
    public String howToEat() {
        return "Fry it or make curry";
    }
}

// Abstract Fruit class implementing Edible
abstract class Fruit implements Edible {}

// Orange class extending Fruit
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Peel and eat";
    }
}

// Apple class extending Fruit
class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Make apple pie or eat raw";
    }
}

// Main class
public class InterfaceMain {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Chicken chicken = new Chicken();
        
        System.out.println(tiger.sound());
        System.out.println(chicken.sound());
        
        //Edible edibleChicken = new Chicken();
        System.out.println(chicken.howToEat());

        Fruit orange = new Orange();
        Fruit apple = new Apple();
        
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}
