package main.java.MultiThraiding;

public class Sync1 {
    public static void main(String[] args) {
        MyRunnableEx2 runnable = new MyRunnableEx2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }


}
class Counter{
    static int count = 0;
}

class MyRunnableEx2 implements Runnable{

    public synchronized void counterFunc(){

        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i =0; i < 3; i++){
            counterFunc();
        }

    }
}
