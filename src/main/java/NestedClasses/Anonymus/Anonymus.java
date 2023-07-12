package main.java.NestedClasses.Anonymus;

public class Anonymus {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            }
        };
    }
}

interface Math{
    int doOperation(int a, int b);
}
