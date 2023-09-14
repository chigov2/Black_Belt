package main.java.Kata.Practeice.Test;

public class GetStringLength {
    public static void main(String[] args) {
        stringLength(null); // => 0
//        stringLength(""); // => 0
//        stringLength("AAA"); // => 3

    }

    public static int stringLength(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        int sum = 0;
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                sum = input.length();
            }
            System.out.println("sum: " + sum);
            return sum;
        }else {
            System.out.println(0);
            return 0;
        }
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
