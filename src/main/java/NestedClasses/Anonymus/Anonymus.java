package main.java.NestedClasses.Anonymus;

public class Anonymus {
    private  int с = 5;
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                Anonymus ac = new Anonymus();
                return a * b + ac.с;
            }
        };
        System.out.println(m.doOperation(6,3));
        System.out.println(m2.doOperation(6,3));
    }
}

interface Math{
    int doOperation(int a, int b);
}
