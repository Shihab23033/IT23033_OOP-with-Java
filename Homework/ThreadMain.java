class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        System.out.println(i);
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        System.out.println(i);
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        MyThread2 obj = new MyThread2();
        Thread thr = new Thread(obj);
        thr.start();
    }
}