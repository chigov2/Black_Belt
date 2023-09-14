package main.java.Kata.Practeice;

import java.util.Arrays;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 0, 7, 1, -4};
        int divider = 2;
        getDivisibleNumbers(numbers, divider);
//

//        nt[] result = {2, 8};
// тільки числа 2 і 8 додатні та діляться націло на 2

    }

    public static int[] getDivisibleNumbers(int[] numbers, int divider) {
        //write your code below this line
       int [] temp = new int [numbers.length];
       int zero = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] % divider ==0 && numbers[i] > 0){
                temp[i-zero] = numbers[i];
            } else {
                zero++;
            }
        }
        int[] result = new int[temp.length-zero];
        System.out.println("temp = " + Arrays.toString(temp));
        System.arraycopy(temp,0,result,0,result.length);
        System.out.println(Arrays.toString(result));

        return result;
        //write your code above this line
    }
}
