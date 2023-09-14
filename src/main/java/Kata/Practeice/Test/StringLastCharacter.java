package main.java.Kata.Practeice.Test;

public class StringLastCharacter {
    public static void main(String[] args) {
        getLastCharacter("a");// => 'a'
        getLastCharacter("abcde");// => 'e'
        getLastCharacter("12345"); //=> '5'

    }
    public static char getLastCharacter(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        char last = 0;
        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (i == charArray.length-1) {
                last = charArray[i];
            }
        }
        System.out.println(last);
        return last;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
