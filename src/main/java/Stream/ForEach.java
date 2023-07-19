package main.java.Stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 4, 78, 75};
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
        System.out.println("----");
//        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myFunc);

    }
}

class Utils {
    public static void myFunc(int a) {
        a = a + 5;
        System.out.println("element = " + a);

    }
}




