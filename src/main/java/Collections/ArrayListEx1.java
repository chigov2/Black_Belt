package main.java.Collections;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mike");
        arrayList.add("Lena");
        arrayList.add("Max");
        arrayList.add("Alex");
        arrayList.add(1,"Vova");

        for (String s: arrayList){
            System.out.println(s);
        }
        System.out.println("--");

        arrayList.set(2,"Alina");
        arrayList.remove(0);
//        for (int i= 0; i <arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
        for (String s: arrayList){
            System.out.println(s);
        }
        System.out.println("--");

    }
}
