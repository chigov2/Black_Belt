package main.java.Kata;

public class IsWerewolf {
    public static void main(String[] args) {
        isWerewolf("home");
    }

    public static boolean isWerewolf(String target) {
        // write your code below this line
        return  new StringBuilder(target).reverse().toString().equals(target);
        // write your code above this line
    }
}
