package main.java.Kata.Practeice.Test.Level8;

import java.util.Arrays;

public class YouOnlyNneedOne {

    public static void main(String[] args) {
        Object[] test1 = new Object[]{117, 115, 104, 45, 85, 112, 115};
//        check(test1,115);
        check(new Object[]{117, 115, 104, 45, 85, 112, 115}, 45);
    }

    public static boolean check(Object[] a, Object x) {
//        boolean b = Arrays.stream(a).anyMatch(t -> t == x);
//        System.out.println(b);
//        return b;
//        System.out.println(Arrays.stream(a).anyMatch(t -> t == x));
//        return  Arrays.stream(a).anyMatch(t -> t == x);
        for (int i = 0; i < a.length; i++){
            if(a[i] == x){
                return true;
            }
        }
        return  false;
    }
}
////////////////////////

//{
//static boolean check(Object[] a, Object x)
//        {
//        return Arrays.asList(a).contains(x);
//        }
//        }