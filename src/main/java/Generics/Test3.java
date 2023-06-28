package main.java.Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<Integer>();
        List<?> list2 = new ArrayList<String>();
        List<Double> list3 = new ArrayList<>();
        list3.add(2.3);
        list3.add(5.3);
        list3.add(8.3);
        list3.add(12.3);
        List<String> list4 = new ArrayList<>();
        list4.add("2.3");
        list4.add("5.3");
        list4.add("8.3");
        list4.add(" mike");

        showListInfo(list3);
        showListInfo(list4);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(2.3);
        ald.add(5.3);
        ald.add(8.3);
        ald.add(12.3);
        System.out.println(summ(ald));
    }

    static  void showListInfo(List<?> list){
        System.out.println("list3: " + list);
    }

    public static  double summ(ArrayList<? extends Number> arrayList){
        double summa = 0;
        for (Number n: arrayList){
            summa += n.doubleValue();
        }
        return summa;
    }
}
