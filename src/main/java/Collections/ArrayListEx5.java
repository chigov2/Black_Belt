package main.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Mike");
        arrayList3.add("Lena");
        arrayList3.add("Max");
        arrayList3.add("Alex");
        arrayList3.add("Vova");
        arrayList3.add("Max");

        List<String> newList = arrayList3.subList(2,4);
        System.out.println(arrayList3);
        System.out.println(newList);

        Object[] o = arrayList3.toArray();
        System.out.println(Arrays.toString(o));
        String[] s = arrayList3.toArray(new String[6]);
//        System.out.println(Arrays.toString(s));
        for (String a: s){
            System.out.print(a +" ");
        }

    }
}
