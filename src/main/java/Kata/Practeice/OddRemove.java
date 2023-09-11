package main.java.Kata.Practeice;

public class OddRemove {
    public static void main(String[] args) {
        removeOddChars("1234"); // "13"
        removeOddChars("(())"); // "()"
        removeOddChars("Bob"); // "Bb"
        removeOddChars(""); // ""
    }
    public static String removeOddChars(String originalString) {
        // write your code below this line

        StringBuilder builder = new StringBuilder();
        char[] charArray = originalString.toCharArray();
        if(originalString != "") {
            for (int i = 0; i < charArray.length; i++) {
                if (i % 2 == 0) {
                    builder.append(charArray[i]);
                }

            }
            System.out.println(builder.toString());
            return builder.toString();
        }
        else return "";
        // write your code above this line
    }

}
