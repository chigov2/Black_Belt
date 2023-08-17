package main.java.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {
        String myString = "12365478978936451225231;\n54612398745632172228891;\n58974563212545571833369";
//      65/41 1236 5478 9789 3645  (231)
//        54612398745632179807891
//        58974563212545576832369
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);//matcher - искать в myString pattern

//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");

//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }


    }
}
