package main.java.Kata.Practeice.Test;

import java.util.List;
import java.util.stream.Stream;

//In this kata you will create a function that takes a list
//        of non-negative integers and strings and returns
//        a new list with the strings filtered out.

//Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
//        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

//if (new Scanner(string).hasNextInt()) {
//        int number = Integer.parseInt(string);
//        }

// isNumeric
// parse

public class ListFiltering {
    public static void main(String[] args) {
//        List<Object> list = Arrays.asList("373", "xyz", "145");
        List<Object> list = List.of(1, 2, "a", "b", 0, 15);
        filterList(list);
    }

    public static List<Object> filterList(final List<Object> list) {
        List<String> collect1 = list.stream().map(Object::toString).toList();
        System.out.println(collect1);

//        List<Integer> collect2 = collect1.stream().map(Integer::parseInt).toList();
//        Stream<Object> collect2 = collect1.stream().map(x -> {
        Stream<Object> collect2 = collect1.stream().map(x -> {
                    try {
                        System.out.println(Integer.parseInt(x));
//                        return x;
                    } catch (NumberFormatException ex) {
//                        System.out.println("Can't format this string");
                        return null;
                    }
                    return x;
                }
        );
        System.out.println("collect2.toList(): " + collect2.toList());


//        List<Object> result;
//        test.forEach(str1 -> {
//                    try {
//                        System.out.println(Integer.parseInt((String) str1));
//                    } catch (NumberFormatException ex) {
////        System.out.println("Can't format this string");
//                    }
//                }
//        );

        return null;
    }
}


//
//list.forEach(str1 -> {
//        try {
//        System.out.println(Integer.parseInt((String) str1));
//        }catch (NumberFormatException ex) {
//        System.out.println("Can't format this string");
//        }
//        }
//        );


//    Stream<Object> stream1 = Arrays.stream(new List[]{list});
//    //        stream1.forEach(System.out::println);
//    String[] strings = stream1.map(Object::toString).toArray(String[]::new);
//        for (String s : strings){
//                System.out.println(s);
//                }
//                return null;

//test.forEach(str1 -> {
//        try {
//        System.out.println(Integer.parseInt((String) str1));
//        } catch (NumberFormatException ex) {
////        System.out.println("Can't format this string");
//        }
//        }
//        );