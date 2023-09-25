package main.java.Kata.Practeice.Test;

public class RemoveChars {
    public static void main(String[] args) {
        String s = "eloquent";
        remove(s);
    }
    public static String remove(String str) {

//        StringBuilder builder = new StringBuilder();
//        char[] charsArray = str.toCharArray();
//
//        for (int i =1; i < charsArray.length-1; i++){
//            builder.append(charsArray[i]);
//
//        }
//        System.out.println(builder);
//        return builder.toString();
        return str.substring(1, str.length() - 1);
    }
}
