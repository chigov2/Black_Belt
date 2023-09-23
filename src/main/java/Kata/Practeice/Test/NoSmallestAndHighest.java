package main.java.Kata.Practeice.Test;

import java.util.Arrays;

public class NoSmallestAndHighest {
    public static void main(String[] args) {
        int[] result1 = {6, 2, 1, 8, 10};
        int[] result2 = {1, 1, 11, 2, 3};
        int[] result3 = null;

//        sum(result1);
//        sum(result2);
        sum(result3);
    }

    public static int sum(int[] numbers) {
        if(numbers == null){
            System.out.println(0);
            return 0;
        }
        if (numbers.length !=0) {
            int result = 0;
            int result1 = 0;
            Arrays.sort(numbers);
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.println("iiiiiii");
            for(int i =1; i < numbers.length -1;i++){
                result1 += numbers[i];

            }
            System.out.println(result1);


            return result1;

        }
        else {
            System.out.println(0);
            return 0;
        }
    }
}
