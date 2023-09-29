package main.java.Kata.Practeice;

import java.math.BigInteger;

public class LastFibDigitBI {
    public static void main(String[] args) {
        lastFibDigit(15);
    }

    static int lastFibDigit(int n) {
        BigInteger n0 = BigInteger.valueOf(1);
        BigInteger n1 = BigInteger.valueOf(1);
        BigInteger n2 = BigInteger.valueOf(1);
        for (int i = 3; i <= n; i++) {
            n2 = n0.add(n1);
            n0 = n1;
            n1 = n2;
        }
        BigInteger resultValue =  n2.remainder(BigInteger.TEN);
        int result = resultValue.intValue();
        System.out.println("n2 % 10 = " + resultValue);
        return result;
    }
}



///
//public static int getFibNumb(int n) {
//    int a = 0;
//    int b = 1;
//    int temp = 0;
//    for ( int i = 1; i < n; i++) {
//        temp = b;
//        b = (b + a)%10;
//        a = temp%10;
//    }
//    return b;
//}