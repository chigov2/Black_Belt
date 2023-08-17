package main.java.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String s ="Ivanov Vasiliy, 48 Elm st, 56987, Russia, email: vasya@gmail.com, +380674308988 ; " +
                "Petrova Marina,  56 Wall st, 23654, Ukraine, email: petrova@gmail.com, +380631811501";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{4,12}");
        //email
//        Pattern pattern = Pattern.compile("\\w{1,15}@\\w+\\.\\w+");
//        Pattern pattern = Pattern.compile("\\w{1,15}@\\w+\\.(ru|com)");

        Pattern pattern = Pattern.compile("(\\w|\\W)\\s+\\w");

//        Pattern pattern = Pattern.compile("I(1)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
//            System.out.println("Position: " + matcher.start() + " " + matcher.group());
            System.out.println(matcher.group());
        }
    }
}
