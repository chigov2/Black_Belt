package main.java.Kata.Practeice.Test;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Finance3 {
    public static void main(String[] args) {
        finance(1000);
    }

    public static BigInteger finance(int n) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i <= n; i++){
//            IntStream.rangeClosed(i, i * 2).forEach(System.out::println);
            IntStream.rangeClosed(i, i * 2);
            sum = IntStream.range(i, (i * 2 + 1)).sum();
//            System.out.println("sum: " + sum);
            result +=sum;
        }
        System.out.println();
        System.out.println("result: " + result);



        return BigInteger.valueOf(result);
    }
}
