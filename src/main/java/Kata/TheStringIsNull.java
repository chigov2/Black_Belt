package main.java.Kata;

public class TheStringIsNull {
    public static void main(String[] args) {
        getUpperCase("");
    }

    public static String getUpperCase(String inputString) {
        // write your code below this line
        if(inputString != null && !inputString.isEmpty()){
            System.out.println(inputString);
            return inputString.toUpperCase();
        }
        return "The string is null!";
        // write your code above this line
    }
}
