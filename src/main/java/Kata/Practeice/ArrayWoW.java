package main.java.Kata.Practeice;

import java.util.Arrays;

public class ArrayWoW {
    public static void main(String[] args) {
        markStringEnds("example"); // ["Example", "examplE"]
        markStringEnds("Bob"); // ["Bob", "BoB"]
        markStringEnds("ALICE"); // ["ALICE", "ALICE"]
        markStringEnds("wow!"); // ["Wow!", "wow!"]
        markStringEnds("o"); // ["O", "O"]
    }

    public static String[] markStringEnds(String originalString) {
        // write your code below this line

        String[] wow = new String[2];

        String first1 = originalString.substring(0, 1).toUpperCase();
        String middle1 = originalString.substring(1);
        String result1 = first1 + middle1;

        wow[0] = result1;

//        String first = originalString.substring(0, 1).toUpperCase();
        String middle2 = originalString.substring(0,originalString.length() -1);
        String last2 = originalString.substring(originalString.length() - 1,originalString.length()).toUpperCase();
        String result2 = middle2 + last2;

        wow[1] = result2;

        System.out.println(Arrays.toString(wow));
        return wow;
        // write your code above this line
    }
}
