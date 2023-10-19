package main.java.Kata.Practeice.Test.Level6;
//      39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//      999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//       4 --> 0 (because 4 is already a one-digit number)

public class PersistentBugger {
    public static void main(String[] args) {

        persistence(400);
    }

    public static int persistence(long n) {

        if (n / 10 == 0)
            return 0;
        long result = 1;
        for (long i = n; n != 0; n /= 10) {
            result *= (n % 10);
            System.out.println(result);
        }
        return persistence(result) + 1;
    }
}
