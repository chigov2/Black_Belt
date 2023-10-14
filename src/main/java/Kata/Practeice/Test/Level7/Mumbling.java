package main.java.Kata.Practeice.Test.Level7;

public class Mumbling {
    public static void main(String[] args) {
        String s = "abcde";
        accum(s);
    }

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        String s2 = "";

        String[] split = s.split("");


        for (int i = 0; i < split.length; i++) {
            builder.append(split[i]);

            for (int j = 0; j < i; j++) {
                builder.append(split[i]);
            }

            if (i < split.length - 1) {
                builder.append("-");
            }
        }
        System.out.println(builder.toString());


        return builder.toString();
    }

}










