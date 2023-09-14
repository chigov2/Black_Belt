package main.java.Kata.Practeice;

public class GetAverageSalary {
    public static void main(String[] args) {
        getAverageSalary(new double[] {1000.00, 500.00}); // 750.00
        getAverageSalary(new double[] {100.00, 200.00, 300.00}); // 200.00
        getAverageSalary(new double[0]); // 0.00
    }

    public static double getAverageSalary(double[] salaries) {
        // write your code below this line
        if (salaries.length != 0) {
            double average = 0.00;
            double count = 0.00;
            for (double i : salaries) {
                count += i;
            }
            average = count / salaries.length;
            System.out.println(" average = " + average);
            return average;
        }else {
            System.out.println("0.00");
            return 0.00;
        }
        // write your code above this line
    }
}
