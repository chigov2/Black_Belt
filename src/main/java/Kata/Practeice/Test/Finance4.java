package main.java.Kata.Practeice.Test;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Finance4 {
    public static void main(String[] args) {
        finance(6);
    }
    public static BigInteger finance(int n) {

        int sum = 0;
        BigInteger result = BigInteger.valueOf(0);
        BigInteger sumN;

        for (int i = 0; i <= n; i++){
            IntStream.rangeClosed(i, i * 2);
            sum = IntStream.range(i, (i * 2 + 1)).sum();
            sumN = BigInteger.valueOf(sum);
            result = result.add(sumN);
        }
        System.out.println("result: " + result);

        return result;
    }
}
