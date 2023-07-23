package main.java.MultiThraiding;

public class Sleep2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Sleep2 thread2 = new Sleep2();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("End");

    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
    }
}
