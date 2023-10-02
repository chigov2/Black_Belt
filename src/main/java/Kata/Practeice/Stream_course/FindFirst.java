package main.java.Kata.Practeice.Stream_course;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        String s = "Mike Stoba";
        int i = s.indexOf(" ");
        String[] s1 = s.split(" ");
        for (int a = 0; a < s1.length; a++){
            System.out.println(s1[a]);
        }
//        System.out.println("s1 split: " + s1) ;

    }
}
