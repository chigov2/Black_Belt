package main.java.Kata.Practeice.Test;

import java.util.Arrays;

public class FindNeedle {
    public static void main(String[] args) {
        String[] test = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        findNeedle(test);
    }

    public static String findNeedle(Object[] haystack) {
//        String result = "";
//        int position = 0;
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] == "needle") {
//                position = i;
//            }
//        }
//        result = "found the needle at position " + position;
//        System.out.println(result);
//        return result;
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
