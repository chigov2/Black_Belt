package main.java.MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx1 {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Friend("Mike",countDownLatch);
        new Friend("Max",countDownLatch);
        new Friend("Alex",countDownLatch);
        new Friend("Lena",countDownLatch);
        new Friend("Alla",countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }


    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("EverythingIsReady to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
}

class Friend extends Thread{
    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к покупкам");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
