package main.java.Kata.Practeice.Test.Level6;

public class GrasshopperSummation {
    public static void main(String[] args) {
        summation(8);

    }

    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum:" + sum);
        return sum;
    }
}
//////////////////
//public static int summation(int n) {
//
//    return IntStream.rangeClosed(1,n).sum();
//}