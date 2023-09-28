package main.java.Kata.Practeice.Test;

import java.math.BigInteger;
import java.util.stream.IntStream;


public class Finance2 {
    public static void main(String[] args) {
        finance(6);
    }
    public static BigInteger finance(int n) {

        IntStream.range(n, (n * 2 + 1)).forEach(System.out::println);
        int sum = IntStream.range(n, (n * 2 + 1)).sum();
        System.out.println("sum: " + sum);


//        Stream.Builder<Integer> numBuilder = Stream.builder();
//        int sum = 0;
//        int t = n + 1;
//        for (int i = 0; i < t; i++) {
//             numBuilder.add(n);
//             n++;
//        }
//        Stream<Integer> numStream = numBuilder.build();
//        int result = numStream.reduce((a, el) -> a * el).get();
//        System.out.println("result: "+ result);
//        numStream.forEach(el->System.out.print(el + " "));




        return BigInteger.valueOf(0);
    }
}
