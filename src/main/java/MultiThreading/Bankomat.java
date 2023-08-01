package main.java.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Mike",lock);
        new Employee("Alex",lock);
        new Employee("Lena",lock);
        Thread.sleep(5000);
        new Employee("Max",lock);
        new Employee("Vova",lock);
    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        //чтобы не создавать и запусать потоки вручную
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + "Wait....");
//            lock.lock();
                System.out.println(name + " use ATM");
                sleep(3000);
                System.out.println(name + " finished with ATM");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name  + " do not want to wait");
        };
    }
}
