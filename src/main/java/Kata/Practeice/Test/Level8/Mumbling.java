package main.java.Kata.Practeice.Test.Level8;

public class Mumbling {
    public static void main(String[] args) {
        String s = "ZpglnRxqenU";
        accum(s);
    }

    public static String accum(String s) {
        String[] split1 = s.split("");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(split1[i].toUpperCase() + "-");
        }

        return "s";
    }

}
