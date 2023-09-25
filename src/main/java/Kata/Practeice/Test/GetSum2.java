package main.java.Kata.Practeice.Test;

public class GetSum2 {
    public static void main(String[] args) {
        GetSum(-1, 2);
    }

        public static int GetSum(int a, int b) {
            int res = 0;
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                res += i;
            }
            return a == b ? a : res;
        }

}
