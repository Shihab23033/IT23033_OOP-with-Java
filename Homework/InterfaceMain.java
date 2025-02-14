interface Edible {
    String howToEat();
}

abstract class Animal {
    abstract String sound();
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger roars";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Chicken clucks";
    }

    @Override
    public String howToEat() {
        return "Fry it or make chicken curry";
    }
}

abstract class Fruit implements Edible {}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Peel and eat";
    }
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Make apple juice or eat raw";
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Chicken chicken = new Chicken();
        
        System.out.println(tiger.sound());

        System.out.println(chicken.sound());
        System.out.println(chicken.howToEat());

        Orange orange = new Orange();
        Apple apple = new Apple();
        
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}
