package main.java.Kata;

import java.util.Arrays;
import java.util.TreeSet;

public class Kata1 {

    public static int[] test1 = {4, 6, 2, 1, 9, 63, -134, 566};
    public static int[] test2 = {-52, 56, 30, 29, -54, 0, -110};
    public static int[] test3 = {42, 54, 65, 87, 0};
    public static int[] test4 = {5};

    public static void main(String[] args) {
        Kata1 result1 = new Kata1();
        Kata1 result2 = new Kata1();
        Kata1 result3 = new Kata1();
        Kata1 result4 = new Kata1();
        result1.min(test1);
        result1.max(test2);
        result1.max(test3);
        result1.min(test4);
    }

    public int min(int[] list) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        return set.first();
    }

    public int max(int[] list) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        return set.last();
    }

}


