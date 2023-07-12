package main.java.NestedClasses.LocalInnerClasses;

public class LocalInnerClass2 {
    public static void main(String[] args) {

        class Slozhenie implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slozhenie slozhenie = new Slozhenie();
        System.out.println(slozhenie.doOperation(3,5));

    }
}

interface Math2{
    int doOperation(int a, int b);
}
