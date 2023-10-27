package main.java.Kata.Practeice.Test.Level6;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PangramChecker {
    public static void main(String[] args) {
//        check("abcdefjhigklmnopqZZZrstuvwtttxyzzzz");
        check("Pack my box with five dozen liquor jugs.");
    }
    public static boolean check(String sentence){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(sentence);
        Set<Character> matchers = new HashSet<>();
        String group = "";
        while (matcher.find()){
             group += matcher.group();
        }
        String group1 = group.toLowerCase();
        char [] charArray = group1.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            matchers.add(charArray[i]);
        }
        System.out.println(matchers);
        if (matchers.stream().count() < 26){
            System.out.println(false);
            return false;
        }
//        System.out.print("group: " + group);
        System.out.println(true);
     return true;
    }
}
///////////////////////
//  return sentence.chars()
//          .filter(Character::isLetter)
//          .map(Character::toLowerCase)
//          .distinct()
//          .count() == 26;
//
//
//public boolean check(String s){
//        return s.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
//        }
//
//public boolean check(String s){
//        return new HashSet<>(Arrays.asList(s.toUpperCase().replaceAll("[^A-Z]","").split(""))).size() == 26;
//        }