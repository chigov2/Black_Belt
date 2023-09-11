package main.java.Kata;

public class CalculateAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        CalculateAverage average = new CalculateAverage();
        System.out.println(find_average(array));
    }


    public static double find_average(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        if(array.length == 0)
            return 0;
        else
        return sum / array.length;
    }
}




