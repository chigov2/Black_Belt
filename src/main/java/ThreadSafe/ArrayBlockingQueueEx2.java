package main.java.ThreadSafe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //producer
        Thread thread1 = new Thread();
        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer added: " + i + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        //consumer
        new Thread(()->{
            while (true){
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer took: " + j + " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
