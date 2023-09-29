package main.java.Kata;

public class LastFibDigit {
    public static void main(String[] args) {
        lastFibDigit(610);
    }

    static int lastFibDigit(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
        System.out.println(n2 % 10);

        return (n2 % 10);
    }
}
