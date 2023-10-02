package main.java.Kata;

public class NASA {
    public static void main(String[] args) {

        makeAbbr("national aeronautics space administration");
    }

    public static String makeAbbr(String fullName) {

        StringBuilder builder = new StringBuilder();

        String[] split = fullName.split(" ");

        for(int i = 0; i < split.length; i++) {
            String firstLetter = split[i].substring(0, 1);
            builder.append(firstLetter);
        }
//        System.out.println(builder.toString().toUpperCase());

        return builder.toString().toUpperCase();
        // write your code above this line
    }
}
