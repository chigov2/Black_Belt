package main.java.Kata.Practeice.Test;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] test = {34, -345, -1, 100};
        resultMin(test);
    }

    public static int[] resultMin(int[] source){

        Arrays.sort(source);

        for (int i : source){
        System.out.print(i + " ");
        }
        return source;
    }
}
