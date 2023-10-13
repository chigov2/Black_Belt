package main.java.Kata.Practeice.Test.Level8;

public class GrasshopperGradeBook {
    public static void main(String[] args) {
        getGrade(99, 99, 95);
    }

    public static char getGrade(int s1, int s2, int s3) {
        int sum =( s1 + s2 + s3)/3;
        if (sum <= 100 && sum >= 90) {
            System.out.println("a");
            return 'A';
        } else if (sum < 90 && sum >= 80) {
            System.out.println("b");
            return 'B';
        } else if (sum < 80 && sum >= 70) {
            System.out.println("C");
            return 'C';
        }else if (sum < 70 && sum >= 60) {
            System.out.println("D");
            return 'D';
        }else if (sum < 60 && sum >= 0) {
            System.out.println("F");
            return 'F';
        }

        System.out.println("end");
        return 'n';
    }
}
/////////////////
//public static char getGrade(int s1, int s2, int s3) {
//    s1=(s1+s2+s3)/3;
//    return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
//}
//}






