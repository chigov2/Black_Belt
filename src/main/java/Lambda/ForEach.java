package main.java.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four");
//        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------");
//        list.forEach(text-> System.out.println(text));
        list.forEach(System.out::println);

        System.out.println("----lambda--------");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(element -> {
            System.out.println(element);
//            element *= 2;
//            System.out.println(element);
        });
    }
}
