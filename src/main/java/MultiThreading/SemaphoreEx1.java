package main.java.MultiThreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx1 {
    public static void main(String[] args) {
        Semaphore callBooth = new Semaphore(2);
        new Person("Mike",callBooth);
        new Person("Alex",callBooth);
        new Person("Max",callBooth);
        new Person("Lena",callBooth);
        new Person("Alla",callBooth);
    }
}
class Person extends Thread{
    private String name;
    private Semaphore callBooth;

    public Person(String name, Semaphore callBooth){
        this.name = name;
        this.callBooth = callBooth;
        this.start();
    }
    @Override
    public void run() {
        System.out.println(name + " waiting.....");
        try {
            callBooth.acquire();
            System.out.println(name + " use cellBooth");
            sleep(2000);
            System.out.println(name + " finished using cellBooth");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBooth.release();
        }
    }
}
