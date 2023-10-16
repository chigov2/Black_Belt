package main.java.Kata.Practeice.Test.Level6;

public class BinaryAddition {
    public static void main(String[] args) {
        binaryAddition(5,6);

    }

    public static String binaryAddition(int a, int b){
        int sum = a + b;
        String s = Integer.toBinaryString(sum);
        System.out.println(s);
        return s;
    }
}
