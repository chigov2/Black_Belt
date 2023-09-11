package main.java.Kata;

public class Students111000 {
    public static void main(String[] args) {
//        getSuccessRate("5");
        getSuccessRate("000");
    }

    public static double getSuccessRate(String statistic) {

        // write your code below this line
        if (statistic.length() == 0){
            System.out.println("0.0");
            return 0.0;
        }
        double counter = 0.0;
        char [] st = statistic.toCharArray();

        for (char ch : st){
            if (ch == '1'){
                counter++;
            }
        }
        System.out.println(counter / st.length);
        return counter / st.length;

        // write your code above this line
    }
}
