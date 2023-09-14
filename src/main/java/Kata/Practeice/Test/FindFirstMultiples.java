package main.java.Kata.Practeice.Test;

import java.util.Arrays;

public class FindFirstMultiples {
    public static void main(String[] args) {
        findMultiples(3, 4); // => [4, 8, 12]
// 4, 8, 12 - перші 3 числа, які кратні числу 4 (діляться на 4 без залишку).

        findMultiples(2, 3); // => [3, 6]
// 3, 6 - перші 2 числа, кратні числу 3 (діляться на 3 без залишку).
        findMultiples(0, 0);

    }
    public static int[] findMultiples(int x, int n) {
        // WRITE YOUR CODE BELOW THIS LINE

        int [] result = new int[x];

        for (int i = 0; i < result.length; i ++){
            result[i]  = n * (i +1);
        }
        System.out.println(Arrays.toString(result));
        return result;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
