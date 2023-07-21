package main.java.Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(2.0);
        list.add(5.0);
        list.add(2.0);
        list.add(5.0);

        double result = list.parallelStream().reduce((a,e)->a + e).get();
        System.out.println("result: "+result);

        double resultDiv = list.parallelStream().reduce((a,e)->a / e).get();//ne nado tal delat
        System.out.println("result division: "+resultDiv);
    }
}
