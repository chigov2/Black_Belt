package main.java.Kata.Practeice;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        getCombinedArray(new int[] {1, 2}, new int[] {3, 4}); // [1, 2, 3, 4]
        getCombinedArray(new int[] {56}, new int[] {-32}); // [56, -32]
        getCombinedArray(new int[] {}, new int[] {}); // []
        getCombinedArray(new int[] {}, new int[] {20, 10}); // [20, 10]
    }

    public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (firstArray == null) {
            return secondArray;
        }

        if (firstArray == null) {
            return secondArray;
        }
        int[] result = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);

        System.out.println(Arrays.toString(result));
        return result;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
