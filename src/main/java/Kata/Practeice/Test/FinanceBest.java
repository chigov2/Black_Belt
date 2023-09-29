package main.java.Kata.Practeice.Test;

import java.math.BigInteger;

public class FinanceBest {
}

//    public static BigInteger  finance(int n) {
//        BigInteger totalNumberOfTiles = BigInteger.valueOf(n+1).multiply(BigInteger.valueOf(n+1));
//        BigInteger emptyTiles = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).divide(BigInteger.valueOf(2));
//        return BigInteger.valueOf(n).multiply(totalNumberOfTiles.subtract(emptyTiles));
//    }
//}

//    public static BigInteger finance(int n) {
//        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).multiply(BigInteger.valueOf(n + 2)).divide(BigInteger.valueOf(2));
//    }

//public class Finance {
//    public static BigInteger finance(int n) {
//        return BigInteger.valueOf((Math.round(Math.pow(n, 2)) + n) * (n + 2) / 2);
//    }


//class Finance {
//    static BigInteger finance(long n) {
//        return BigInteger.valueOf(n * ++n * ++n / 2);
//    }

//public class Finance {
//    public static BigInteger finance(int n) {
//        return valueOf(n).multiply(valueOf(n + 1)).multiply(valueOf(n + 2)).shiftRight(1);
//    }
//}

//interface Finance {
//    static BigInteger finance(long n) {
//        return BigInteger.valueOf(n * ++n * ++n / 2);
//    }
//}


//class Finance12 {
//
//    public static BigInteger finance(int n) {
//        BigInteger a  = new BigInteger("0");
//
//        for (int i = 0; i <= n ; i++){
//            BigInteger b = BigInteger.valueOf(n*(i+1));
//
//            a = a.add(b);
//        }
//
//        return a;
//    }
//}

//class Finance6 {
//
//    public static BigInteger  finance(int n) {
//        return BigInteger.valueOf(((long) (n + 1) *(n+1) - (long) n *(n+1)/2) * n);
//    }
//}

//class Finance8 {
//
//    public static BigInteger finance(int n) {
//
//        BigInteger result = BigInteger.ZERO;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j<=i*2; j++) {
//                result = result.add(BigInteger.valueOf(j));
//            }
//        }
//
//        return result;
//    }
//}
