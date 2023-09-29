package main.java.Kata.Practeice.Test.Level8;

public class MakeNegative {
    public static void main(String[] args) {
        makeNegative(0);
    }

    public static int makeNegative(final int x) {

        if (x >= 0) {
            System.out.println(-x);
            return -x;
        } else {
            System.out.println(x);
            return x;
        }

    }
}

// return -abs(x);

//return (x < 0) ? x : -x;

//return -Math.abs(x);