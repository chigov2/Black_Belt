package main.java.Kata.Practeice;

public class CenturyFromYear {
    public static void main(String[] args) {
        getCentury(1705); // 18
        getCentury(1900); // 19
        getCentury(1601); // 17
        getCentury(2000); // 20
    }

    public static int getCentury(int year) {
        // WRITE YOUR CODE BELOW THIS LINE
        int century = 0;
        century = (year - 1) / 100 +1;
        System.out.println(century);
        return century;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
