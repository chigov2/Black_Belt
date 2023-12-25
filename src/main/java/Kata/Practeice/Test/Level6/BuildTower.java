package main.java.Kata.Practeice.Test.Level6;
//          Build a pyramid-shaped tower,
//        as an array/list of strings,
//        given a positive integer number of floors.
//        A tower block is represented with "*" character.
//        [
//        "  *  ",
//        " *** ",
//        "*****"
//        ]
public class BuildTower {
    public static void main(String[] args) {
     towerBuilder(5);
    }

    public static String[] towerBuilder(int nFloors)
    {

        for (int i = 1; i < nFloors; i++) {
            // white spaces in the front of the numbers
            System.out.print("\"");
            int numberOfWhiteSpaces = nFloors - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print character
            printString("* ", i);

            //move to next line
            printString(" ", numberOfWhiteSpaces-1);
            System.out.print("\"");
            System.out.println("");
        }

        return new String[0];
    }
    private static void printString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
}
