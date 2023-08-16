package main.java.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "AMBYCFHCVNCdeFLkSJSYENRKRT";

//        String s1 = "фиыты qwe kfddskfsd ldsfk";
        String s1 = "asas---- &&&&++++++ T========kfddskfsd-ldsfk";
//        Pattern pattern1 = Pattern.compile("[ABC]");
//        Pattern pattern1 = Pattern.compile("AM[C-F]SY");
//        Pattern pattern1 = Pattern.compile("\\w+");
//        Pattern pattern1 = Pattern.compile("\\W");
//        Pattern pattern1 = Pattern.compile("\\W+");
        Pattern pattern1 = Pattern.compile("\\W{3}");

        Matcher matcher1 = pattern1.matcher(s1);

        while(matcher1.find()){
            System.out.println("Position: " + matcher1.start() + " " + matcher1.group());
        }
    }
}
