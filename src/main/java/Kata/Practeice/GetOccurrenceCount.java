package main.java.Kata.Practeice;

public class GetOccurrenceCount {
    public static void main(String[] args) {
        getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue"); // 3
        getOccurrenceCount(new String[] {"blue", "green", "red"}, "red"); // 1
        getOccurrenceCount(new String[] {"blue", "green", "red"}, "white"); // 0
        getOccurrenceCount(new String[] {"blue", "green", "red"}, null); // 0
        getOccurrenceCount(new String[0], "blue"); // 0
    }

    public static int getOccurrenceCount(String[] colors, String targetColor) {
        // write your code below this line

        int count = 0;
        for (int i = 0; i < colors.length; i++)
            if (colors[i].equals(targetColor)){
                count++;
            }
        System.out.println(count);
        return count;
        // write your code above this line
    }
}
