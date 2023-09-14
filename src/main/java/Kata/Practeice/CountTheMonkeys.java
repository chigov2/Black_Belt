package main.java.Kata.Practeice;

import java.util.Arrays;

public class CountTheMonkeys {
    public static void main(String[] args) {
        countTheMonkeys(5); // [1, 2, 3, 4, 5]
        countTheMonkeys(8); // [1, 2, 3, 4, 5, 6, 7, 8]
        countTheMonkeys(0); // [] (порожній масив)
    }

    public static int[] countTheMonkeys(int count) {
        // write your code below this line
        int [] result = new int[count];
        for (int i = 0; i < result.length; i++){
            result[i] = i + 1;
        }
        System.out.println(Arrays.toString(result));
        return result;
        // write your code above this line
    }
}
