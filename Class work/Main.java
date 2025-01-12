 class animal {
    String sound;
    void SetSound(String s){
        this.sound=s;
    }
}
class Cat{
    private String sound;
    void SetSound(String s){
        this.sound=s;
    }
    String GetSound(){
        return this.sound;
    }
}
class Dog{
    private String sound;
    void SetSound(String sound){
        this.sound=sound;
    }
    String GetSound(){
        return this.sound;
    }
}
public class Main{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.SetSound("Mew Mew");
        System.out.println(c.GetSound());
        Dog d = new Dog();
        d.SetSound("Ghew Ghew");
        System.out.println(d.GetSound());
        animal a= new animal();
        a.SetSound(null);
    }
}
