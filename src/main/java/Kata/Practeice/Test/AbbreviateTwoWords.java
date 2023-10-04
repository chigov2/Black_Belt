package main.java.Kata.Practeice.Test;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String s = "patrick feeney stoba angjey";
        abbrevName(s);
    }
    public static String abbrevName(String name) {
        StringBuilder builder = new StringBuilder();
        String[] splitString = name.split(" ");

        for (int i = 0; i < splitString.length; i++) {
            String firstLetter = splitString[i].substring(0, 1);

            builder.append(firstLetter);
            if (i >= 0 && i < splitString.length-1){
                builder.append(".");
            }
        }
        System.out.println(builder.toString().toUpperCase());
        String s = builder.toString().toUpperCase();

        return s;

    }
}

