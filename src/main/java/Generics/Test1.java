package main.java.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qw");
        list.add("er");
        list.add("tryt");
        list.add("fgf");
        for (String s: list){
            System.out.println(s + " dlina: " + s.length());
        }
    }
}
