package main.java.MultiThreading;

public class Sync3 {
    static int counter =0;
    public static synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        Thread thread3 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(counter);
    }
}

class R2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<1000; i++){
            Sync3.increment();
        }
    }
}
