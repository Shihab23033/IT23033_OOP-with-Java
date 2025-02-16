package assignment_codes;

class thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("thread1 is running");
    }
}
class thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread2 is running");
    }
}
public class qus26 {
    public static void main(String[] args) {
        thread1 t = new thread1();
        t.run();
        Thread t2 = new Thread(new thread2());
        t2.run();
    }
    
}
