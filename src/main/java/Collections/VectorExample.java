package main.java.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Mike");
        vector.add("Lena");
        vector.add("Alex");
        vector.add("Max");
        System.out.println(vector);
        System.out.println(vector.lastElement());
    }
}
