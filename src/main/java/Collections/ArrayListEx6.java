package main.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Mike");
        arrayList3.add("Lena");
        arrayList3.add("Max");
        arrayList3.add("Alex");
        arrayList3.add("Vova");
        arrayList3.add("Max");

        List<Integer> list = List.of(3,5,8,6,7);
        System.out.println(list);

        List<String> list2 = List.copyOf(arrayList3);
        System.out.println("--");
        System.out.println(list2);
    }
}
