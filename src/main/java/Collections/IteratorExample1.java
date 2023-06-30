package main.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Mike");
        arrayList3.add("Lena");
        arrayList3.add("Max");
        arrayList3.add("Alex");
        arrayList3.add("Vova");
        arrayList3.add("Max");

        Iterator<String> iterator = arrayList3.iterator();
        while
        (iterator.hasNext()){
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList3);
        System.out.println("--");
    }
}
