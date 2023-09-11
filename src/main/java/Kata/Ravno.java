package main.java.Kata;

public class Ravno {

    public static void main(String[] args) {
        getValue("qwqw=wdwdqw");

    }
    public static String getValue(String dataFromDatabase) {
        // write your code below this line
        int indexOfEquals = dataFromDatabase.indexOf("=") + 1;
        String substring = dataFromDatabase.substring(indexOfEquals);
        System.out.println(substring);
        return substring;
        // write your code above this line
    }
}
