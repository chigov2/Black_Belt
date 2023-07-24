package main.java.MultiThraiding;

public class SyncBlock1 {
    public static void main(String[] args) {
        MyRunnableBlock3 runnable = new MyRunnableBlock3();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter1{
    static int count = 0;
}

class MyRunnableBlock3 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i < 3; i++){
            doWork1();
        }

    }

    private void doWork2(){
        System.out.println("Hello");
    }

    private void doWork1(){
        doWork2();
        synchronized(this) {
            Counter1.count++;
            System.out.println(Counter1.count);
        }
    }
}

