package main.java.Kata.Practeice.Test.Level6;

import java.util.ArrayList;
import java.util.Collections;


//Your task is to make a function that can take any non-negative
// integer as an argument and return it with its digits in
// descending order. Essentially, rearrange the digits to
// create the highest possible number.
//Input: 42145 Output: 54421
public class DescendingOrder {
    public static void main(String[] args) {
        sortDesc(77563982);
    }

    public static int sortDesc(final int num) {

        int temp = num;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);

        System.out.println(array);

        Collections.sort(array, Collections.reverseOrder());
        System.out.println(array);
        int result = 0;
        for (Integer i : array) { // assuming list is of type List<Integer>
            result = 10*result + i;
        }
        System.out.println(result + " total");
        return result;
    }
}



///////////////////////////////
//String[] array = String.valueOf(num).split("");
//        Arrays.sort(array,Collections.reverseOrder());
//                return Integer.valueOf(String.join("",array));
//
//return Integer.parseInt(String.valueOf(num)
//                .chars()
//                .mapToObj(i->String.valueOf(Character.getNumericValue(i)))
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.joining()));