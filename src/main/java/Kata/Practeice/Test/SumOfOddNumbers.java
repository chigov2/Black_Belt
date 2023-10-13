package main.java.Kata.Practeice.Test;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        rowSumOddNumbers(5);// 4 64 5 -125
    }

    public static int rowSumOddNumbers(int n) {

        System.out.println(Math.pow(n,3));
        return (int)(Math.pow(n,3));
    }
}


//////////////
//int sum = 0;
//        for (int i = 1, row = 1; row <= n; row++) {
//
//                sum = 0;
//                for (int j = 0; j < row; j++, i+=2) {
//        sum += i;
//        }
//        }
//
//        return sum;

//    int[] a = new int[n];
//    int first = 1;
//    int z = 0;
//      for (int i = 0 ; i < n ; i++){
//
//        first = first+z;
//        z = z+2;
//        }
//
//        a[0]=first;
//        for(int i = 1 ; i<n ; i++){
//        first = first+2;
//        a[i]=first;
//        }
//        int sum = 0;
//        for(int i = 0 ; i < a.length;i++){
//        sum = sum+a[i];
//        System.out.println(a[i]);
//        }
//        return sum;
//        }