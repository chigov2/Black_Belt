package main.java.Kata.Practeice.Test;

public class Century {
    public static void main(String[] args) {

        century(1901);
    }
    public static int century(int number) {

//        int century = 0;
//        century = (number - 1) / 100 +1;
//        System.out.println(century);
//        return century;
        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
    }
}
