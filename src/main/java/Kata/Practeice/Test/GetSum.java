package main.java.Kata.Practeice.Test;

public class GetSum {
    public static void main(String[] args) {
        GetSum(-1, 2);
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a != b && a < b) {
            System.out.println("a != b && a > b");
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("sum: " + sum);
            return sum;
        } else if (a > b){
            System.out.println("a<b");
            for (int i = b; i <= a; i++){
                sum +=i;
            }
            System.out.println("sum: " + sum);
            return sum;
        }
        else{
            System.out.println("sum: " + b);
            return b;}
        }
    }

