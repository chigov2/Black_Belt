package main.java.Kata.Practeice.Test;

public class Past {
    public static void main(String[] args) {
        Past(19, 58, 6);
    }
    public static int Past(int h, int m, int s)
    {
        int millis = 1000;
        int seconds  = millis * s;
        System.out.println("s: " + seconds);
        int minutes = m * 60 * millis;
        System.out.println("m: " + minutes);
        int hours = h * 3600 * millis;
        System.out.println("h: " + hours);
        System.out.println((hours + minutes + seconds));
        return hours + minutes + seconds;
    }//71886000
     //69606000
}
