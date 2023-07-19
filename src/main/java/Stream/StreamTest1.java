package main.java.Stream;

import java.lang.reflect.Array;
import java.util.*;
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
        System.out.println("list2: "+list2);
        int[] array0 = {1, 12, 6, 8, 90, 56};
        int[]array7 = Arrays.stream(array0).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println("array7: "+Arrays.toString(array7));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Ин");
        set.add("Are you OK?");
        set.add("Yes");
        set.add("Good bye");
        System.out.println(set);

        Set<Integer> newSet = set.stream().map(i->i.length()).collect(Collectors.toSet());
        List<Integer> newList = set.stream().map(i->i.length()).collect(Collectors.toList());
        System.out.println("NewSet: " + newSet);
        System.out.println("NewLst: " + newList);
    }
}


