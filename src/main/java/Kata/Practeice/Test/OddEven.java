package main.java.Kata.Practeice.Test;

public class OddEven {
    public static void main(String[] args) {
        even_or_odd(-1);

    }
    public static String even_or_odd(int number) {
        String even = "Even";
        String odd = "Odd";
        if (number % 2 == 0)
        {
            System.out.println(even);
            return even;}
        else
        {
            System.out.println(odd);
            return odd;}
    }
}
