package main.java.Kata.Practeice.Test;

public class TestTestTest {

    public static void main(String[] args) {
        test("Hello",7);
    }

    public static String test(String str, int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++){
            builder.append(str);
        }
        System.out.println(builder);
        return builder.toString();
    }
}
