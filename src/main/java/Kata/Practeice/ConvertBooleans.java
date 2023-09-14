package main.java.Kata.Practeice;

import java.util.Arrays;

public class ConvertBooleans {
    public static void main(String[] args) {
        getStringArray(new boolean[] {true, false}); // ["Yes", "No"]
        getStringArray(new boolean[] {false}); // ["No"]
        getStringArray(new boolean[] {}); // []
    }

    public static String[] getStringArray(boolean[] values) {
        // WRITE YOUR CODE BELOW THIS LINE
        String yes = "Yes";
        String no = "No";

        if (values.length == 0 ){
            System.out.println("[]");
            return new String[]{};
        }
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++){
            if (values[i] == true){
                result[i] = yes;
            }
            else if(values[i] == false) {
                result[i] = no;
                }
        }
        System.out.println(Arrays.toString(result));
        return result;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
