package main.java.Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,4,5,7,8,43,6,7,89);
        stream1.filter(element -> {
            System.out.println("-------");
            return element%2 == 0;
        }).collect(Collectors.toList())
        ;
    }
}
