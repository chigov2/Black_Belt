package main.java.Kata.Practeice.Test.Level8;

import java.util.*;

public class HighestAndLowest {
    public static void main(String[] args) {
        String test = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        highAndLow(test);

    }

    public static String highAndLow(String numbers) {
        StringBuilder builder = new StringBuilder();
        String[] s = numbers.split(" ");
        Object[] array = Arrays.stream(s).map(Integer::parseInt).toArray();
        Arrays.sort(array);
        builder.append(array[array.length - 1]);
        builder.append(" ");
        builder.append(array[0]);

//        System.out.println(builder);

        return builder.toString();
    }

}
/////////////////////////////////////
//class Kata {
//    static String highAndLow(String numbers) {
//        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//        return stats.getMax() + " " + stats.getMin();
//    }
//}


//public class Kata {
//    public static String highAndLow(String numbers) {
//        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
//        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
//    }
//}