package main.java.Stream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(12);
        list1.add(33);
        list1.add(73);
        int result = list1.stream().reduce((accumulator,element)->accumulator*element).get();
        System.out.println(result);

    }
}
