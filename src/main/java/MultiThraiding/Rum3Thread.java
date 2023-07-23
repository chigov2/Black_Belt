package main.java.MultiThraiding;

public class Rum3Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Method Run and Thread banew: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Rum3Thread());
        thread.start();
        System.out.println("Method Main and Thread banew: " + Thread.currentThread().getName());
    }
}
