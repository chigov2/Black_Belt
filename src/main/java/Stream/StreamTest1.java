package main.java.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Ин");
        list.add("Are you OK?");
        list.add("Yes");
        list.add("Good bye");

//        for (int i = 0; i< list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()) );
//        }
        list.stream().map(el -> el.length());
//        List <Integer> list2 = list.stream().map(el->el.length());
        List<Integer> list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list2);
        int[] array0 = {1, 3, 6, 8, 90, 56};
        Arrays.stream(array0).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array0));
    }
}


