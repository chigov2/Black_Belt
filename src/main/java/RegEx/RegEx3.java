package main.java.RegEx;

import java.util.Arrays;

public class RegEx3 {
    public static void main(String[] args) {
        String s ="Ivanov Vasiliy, 48 Elm st, 56987, Russia, email: vasya@gmail.com, +380674308988 ; " +
                "Petrova Marina,  56 Wall st, 23654, Ukraine, email: petrova@gmail.com, +380631811501";
        String s2 = "petrova@gmail.com";
        boolean result = s2.matches("\\w{1,15}@\\w+\\.(ru|com)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }

}
