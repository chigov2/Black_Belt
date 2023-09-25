package main.java.Kata.Practeice.Test;

public class ZeroFuel {
    public static void main(String[] args) {
        zeroFuel(50,25,2);
        zeroFuel(100,50,1);
    }

    public static boolean zeroFuel(double distanceToPump,
                                   double mpg,
                                   double fuelLeft) {

//        if (mpg * fuelLeft >= distanceToPump) {
//            System.out.println("true");
//            return true;
//        } else {
//            System.out.println("false");
//            return false;
//        }

//        return distanceToPump <= mpg * fuelLeft;

        boolean answer = (mpg * fuelLeft) >= distanceToPump ? true : false;
        return answer;
    }
}
