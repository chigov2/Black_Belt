package main.java.ThreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i ++){
            arrayList.add(i);
        }
        List<Integer> syncList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = ()-> {
            //итератор не выставляет lock, поэтому надо добавить  synchronized
            synchronized (syncList){
            Iterator<Integer> iterator = syncList.iterator();
            while ( iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
        };
//        Runnable runnable2 = ()->{arrayList.remove(10);};
        Runnable runnable2 = ()->syncList.remove(10);

        Thread thread1 = new Thread(runnable1);// из-за синхронайзед поток 2 будет ждать пока 1 поток не завершит работу
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncList);

    }
}
