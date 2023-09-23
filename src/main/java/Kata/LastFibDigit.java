package main.java.Kata;

public class LastFibDigit {
    public static void main(String[] args) {
        lastFibDigit(302);
    }

    static double lastFibDigit(int n) {
        double n0 = 1;
        double n1 = 1;
        double n2 = 1;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
        System.out.println(n2 % 10);

        return (n2 % 10.0);
    }
}
