package main.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(12);
        list1.add(33);

        int result = list1.stream().reduce((accumulator,element)->accumulator*element).get();
        int result2 = list1.stream().reduce(1,(accumulator,element)->accumulator*element);
        System.out.println(result);
        System.out.println("------------");
        System.out.println(result2);

        List<Integer> list100 = new ArrayList<>();
        list100.add(11);
//        int result100 = list100.stream().reduce((accumulator,element)->accumulator*element).get();
        Optional<Integer> result100 = list100.stream().reduce((accumulator, element)->accumulator*element);
        if (result100.isPresent()){System.out.println("result100: " + result100.get());}
        else {
            System.out.println("not present");
        }
        List<String> newArrayList = new ArrayList<>();
        newArrayList.add("wsd");
        newArrayList.add("sds");
        newArrayList.add("sda");
        newArrayList.add("fgf");
        newArrayList.add("gf");
        String result4 = newArrayList.stream().reduce((accumulator,element)-> accumulator + " " + element).get();
        System.out.println("result4: " + result4);


    }
}
