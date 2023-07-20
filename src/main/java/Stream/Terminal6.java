package main.java.Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,4,5,7,8,43,6,7,89);
        stream1.filter(element -> {
            System.out.println("-------");
            return element%2 == 0;
        }).collect(Collectors.toList());
        System.out.println("---2---");
        Stream<Integer> stream2 = Stream.of(1,4,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(el-> System.out.println(el));
    }


}
