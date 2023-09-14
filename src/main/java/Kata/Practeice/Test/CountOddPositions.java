package main.java.Kata.Practeice.Test;

import java.util.Arrays;

public class CountOddPositions {
    public static void main(String[] args) {
//        countOddPositionChars(["Hello", "world", "from", "array"]); //=> 9
//        Загальна кількість символів "Hello" та "from": 5 + 4 = 9
//        "world" та "array" пропущені, оскільки їхні індекси (1 та 3 відповідно) є непарними.
//        String [] array1 = {"Mike", "Max", "Lena","Sasha","Anna11"};
        String [] array1 = {};
countOddPositionChars(array1);
    }
    public static int countOddPositionChars(String[] array) {
        // WRITE YOUR CODE BELOW THIS LINE
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                count += array[i].length();
                System.out.println(array[i]);
            }
        }
        System.out.println("count: " + count);
        return count;
                }
        // WRITE YOUR CODE ABOVE THIS LINE
    }
