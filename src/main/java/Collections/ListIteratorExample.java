package main.java.Collections;

import java.util.LinkedList;
import java.util.List;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);
    }
}
