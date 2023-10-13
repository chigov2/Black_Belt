package main.java.Kata.Practeice.Test.Level8;

public class CannotSleep {
    public static void main(String[] args) {
        countingSheep(5);
    }

    public static String countingSheep(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i =1; i <= num; i++) {
            builder.append(i).append(" sheep...");
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}
