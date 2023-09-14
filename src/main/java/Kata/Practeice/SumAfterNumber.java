package main.java.Kata.Practeice;

import java.util.Arrays;

public class SumAfterNumber {

    public static void main(String[] args) {
        getSum(new int[]{3, 3, 3}, 3); // 2 + 3 = 5
        getSum(new int[]{10, 2, 50, 3, 4, 0}, 50); // 3 + 4 + 0 = 7
        getSum(new int[]{10, 2, 50, 3, 4, 0}, 300); // 0 (бо в масиві немає значення -100)
        getSum(new int[]{10}, 10); // 0
    }

    public static int getSum(int[] values, int startValue) {
        // WRITE YOUR CODE BELOW THIS LINE l
        int count = 0;
        int position = 0;
        int finalValue = 0;
        boolean startValueFound = false;
        //int[] temp = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            count++;
            if (values[i] == startValue) {
                position = count;
                startValueFound = true;
                break;
            }
        }
//        System.out.println("count: " + count);
//        System.out.println("values.length: " + values.length);

        if (startValueFound == true) {
            int[] result = new int[values.length - position];

            System.arraycopy(values, position, result, 0, values.length - position);

            System.out.println("result: " + Arrays.toString(result));

            for (int i = 0; i < result.length; i++) {
                finalValue += result[i];
            }
            System.out.println("finalValue: " + finalValue);
            return finalValue;
        } else {
            System.out.println(0);
            return 0;
        }
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
