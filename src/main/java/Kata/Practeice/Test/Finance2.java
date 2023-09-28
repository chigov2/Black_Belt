package main.java.Kata.Practeice.Test;

import java.math.BigInteger;
import java.util.stream.IntStream;


public class Finance2 {
    public static void main(String[] args) {
        finance(5);
    }

    public static BigInteger finance(int n) {
        int result = 0;
        int sum = 0;

        IntStream.rangeClosed(n, n * 2).forEach(System.out::println);
        sum = IntStream.range(n, (n * 2 + 1)).sum();
        System.out.println("sum: " + sum);
        result +=sum;

        return BigInteger.valueOf(result);
    }
}
