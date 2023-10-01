package main.java.Kata.Practeice.Test.Level8;

import java.util.Arrays;

public class Digitize {
    public static void main(String[] args) {
        digitize(1234);
    }
    public static int[] digitize(long n) {

        int[] reversed = Arrays.stream(new StringBuilder()
                .append(n)
                .reverse()
                .toString()
                .split("(?<=.)"))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.stream(reversed).forEach(System.out::print);

        return reversed;
    }
}


//

//    public static int[] digitize(long n) {
//        return new StringBuilder().append(n)
//                .reverse()
//                .chars()
//                .map(Character::getNumericValue)
//                .toArray();
//    }

// return new StringBuilder(String.valueOf(n))
//         .reverse()
//         .chars()
//         .map(Character::getNumericValue)
//         .toArray();
//         }

/// best