package main.java.Collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mike");
        stack.push("Lena");
        stack.push("Max");
        stack.push("Alla");
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
