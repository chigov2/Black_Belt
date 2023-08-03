package main.java.ThreadSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx1 {
    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer, String> hashMap = new HashMap<>();// do no work
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();// do no work
        hashMap.put(1,"Mike");
        hashMap.put(2,"Max");
        hashMap.put(3,"Alex");
        hashMap.put(4,"Lena");
        hashMap.put(5,"Alla");
        System.out.println(hashMap);

        Runnable runnable1 = ()-> {
                                                //получаем из hashmap множество его ключей
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext())
                {try {Thread.sleep(100);}//////////////
                catch (InterruptedException e) {e.printStackTrace();}
                Integer i = iterator.next();
                    System.out.println(i + " : " + hashMap.get(i));
            }
        };

        Runnable runnable2 = ()->{
            try {Thread.sleep(300);}
            catch (InterruptedException e) {e.printStackTrace();}
            hashMap.put(6,"Vova");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(hashMap);// with added 6
    }
}
