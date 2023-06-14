package main.java.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mike");
        list.add("Alex");
        list.add("Lena");
        list.add("Max");
        System.out.println(list);
        System.out.println("-------------");
        Collections.sort(list);
        System.out.println(list);
    }
}
