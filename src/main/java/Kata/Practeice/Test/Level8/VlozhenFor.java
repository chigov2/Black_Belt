package main.java.Kata.Practeice.Test.Level8;

public class VlozhenFor {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a ++) {
//внутри первого цикла можно сделать 2ой
            for (int b = 1; b < 10; b ++)
                System.out.print (" " + a*b); //печатаем числа через пробел
            System.out.println (); //поставить enter для новой строчки
        }
    }
}
