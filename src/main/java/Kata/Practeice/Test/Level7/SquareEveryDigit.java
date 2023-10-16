package main.java.Kata.Practeice.Test.Level7;

import java.util.ArrayList;

public class SquareEveryDigit {
    public static void main(String[] args) {
//        squareDigits(8962);
        squareDigits(9119);
    }
    public static int squareDigits(int n) {
        StringBuilder builder = new StringBuilder();
        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(n % 10);
            n /= 10;
        } while (n > 0);

        for (int j = array.size() - 1; j >= 0; j--) {
            int w = array.get(j) *array.get(j);
            builder.append(w);
        }
        System.out.println(builder);
        return Integer.parseInt(builder.toString());
    }
}
