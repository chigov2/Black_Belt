package main.java.Kata;

public class MinMax {
    public static void main(String[] args) {
        int[] test = {};
//        int[] test = {;
        getSpeedStatistic(test);
    }

    public static int[] getSpeedStatistic(int[] results) {
        //Write code below this line
        int[] minMax = new int[2];

        if (results.length != 0) {

            int min = results[0];
            int max = results[0];
            for (int i = 1; i < results.length; i++) {
                if (results[i] > max) {
                    max = results[i];
                } else if (results[i] < min) {
                    min = results[i];
                }
            }
            minMax[0] = max;
            minMax[1] = min;
            System.out.println("min: " + minMax[0]);
            System.out.println("max: " + minMax[1]);
        }
        else {System.out.println("zero");
            minMax[0] = 0;
            minMax[1] = 0;
            System.out.println("min: " + minMax[0]);
            System.out.println("max: " + minMax[1]);
        }
        return minMax;
    }
}

//Write code above this line


