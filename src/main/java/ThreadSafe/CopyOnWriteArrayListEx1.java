package main.java.ThreadSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx1 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
//        ArrayList<String> list = new ArrayList<>();
        list.add("Mike");
        list.add("Max");
        list.add("Lena");
        list.add("Alla");
        list.add("Alex");
        System.out.println(list);

        Runnable runnable2 = ()-> {Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(iterator.next());
        }
        };

        Runnable runnable1 = ()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Sergey");
        };
        Thread thread2 = new Thread(runnable2);
        Thread thread1 = new Thread(runnable1);

        thread2.start();
        thread1.start();

        thread2.join();
        thread1.join();

        System.out.println(list);
    }
}
