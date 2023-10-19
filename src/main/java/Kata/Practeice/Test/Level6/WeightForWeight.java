package main.java.Kata.Practeice.Test.Level6;

//"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
//
//"100 180 90 56 65 74 68 86 99"

public class WeightForWeight {
    public static void main(String[] args) {
        String s = "2000 103 123 4444 99";
        String s1 = "11 11 2000 10003 22 123 1234000 44444444 9999";
        orderWeight(s);
    }

    public static String orderWeight(String st){
        System.out.println(st.split(" "));
        return "";
    }
}
