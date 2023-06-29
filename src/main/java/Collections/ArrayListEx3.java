package main.java.Collections;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Mike");
        arrayList3.add("Lena");
        arrayList3.add("Max");
        arrayList3.add("Alex");
        arrayList3.add(1,"Vova");
        arrayList3.add("Max");
        System.out.println(arrayList3);

        int index = arrayList3.indexOf("Max");
        int index2 = arrayList3.lastIndexOf("Max");
        System.out.println(index);
        System.out.println(index2);

//        ArrayList<String> arrayList4 = new ArrayList<>();
//        arrayList4.add("111");
//        arrayList4.add("222");
////        arrayList3.addAll(arrayList4);
//        arrayList3.addAll(1,arrayList4);
//        System.out.println("--");
//        System.out.println(arrayList3);
        System.out.println(arrayList3.contains("Olga"));

    }
}
