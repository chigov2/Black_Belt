package main.java.Collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("F");

        StringBuilder[] array = {sb1,sb2,sb3,sb4,sb5};

        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
//        System.out.println(Arrays.toString(array));
//        array[1].append("***");
        array[0] = new StringBuilder("!!!");
        System.out.println(list);


    }
}
