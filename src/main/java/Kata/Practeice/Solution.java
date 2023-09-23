package main.java.Kata.Practeice;

public class Solution {


    public static void main(String[] args) {
        solution(18);

    }
    public static int solution(int number) {
        int result = 0;
        for(int i =0; i < number; i++){
            if (i % 3 == 0 && i % 5 == 0){
                result +=i;
            }else if ((i % 3 == 0) && (i % 5 !=0)){
                result +=i;
            }else if ((i % 3 != 0) && (i % 5 ==0)){
                result +=i;
            }
        }
        System.out.println(result);
        //TODO: Code stuff here
        return result;
    }
}
