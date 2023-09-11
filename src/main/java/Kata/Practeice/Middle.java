package main.java.Kata.Practeice;

public class Middle {
    public static void main(String[] args) {
        getMiddleString("");
    }

    public static String getMiddleString(String originalString) {

        // write your code below this line
        String substring = "";
        if (originalString != "") {
            if (originalString.length() % 2 == 0) {
                substring = originalString.substring((originalString.length() / 2) - 1, (originalString.length() / 2) + 1);
            } else {
                substring = originalString.substring((originalString.length() / 2), (originalString.length() / 2) + 1);

            }
            System.out.println(substring);


            return substring;
        }else {
            System.out.println("\"\"");
            return "";}
        // write your code above this line
    }
}
