package main.java.MultiThreading;

public class Sync1 {
    public static void main(String[] args) {
        MyRunnableEx3 runnable = new MyRunnableEx3();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }


}
class Counter2{
    static int count = 0;
}

class MyRunnableEx3 implements Runnable{

    public synchronized void doWork1(){

        Counter2.count++;
        System.out.println(Counter2.count);
    }
    @Override
    public void run() {
        for (int i =0; i < 3; i++){
            doWork1();
        }

    }
}
