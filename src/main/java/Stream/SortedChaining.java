package main.java.Stream;

import java.util.Arrays;

public class SortedChaining {
    public static void main(String[] args) {
        int[] array01 = {2,3,6,45,4,8,3};
//        array01 = Arrays.stream(array01).sorted().toArray();
        System.out.println(Arrays.toString(array01));
        System.out.println("----");

        int result = Arrays.stream(array01).filter(e->e%2 == 1)
                .map(e->{if (e%3 == 0){e = e /3;} return e;})//всли есть остаток, то деление не делается и результат сразу возвращается
//                .reduce((a,e)->a+e).getAsInt();
                .reduce(Integer::sum).getAsInt();
        System.out.println(result);
        //3 45 3
    }
}
