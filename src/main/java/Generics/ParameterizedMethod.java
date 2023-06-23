package main.java.Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(83);
        arrayList.add(13);

        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("3");
        arrayList1.add("15");
        arrayList1.add("7");
        arrayList1.add("83");
        arrayList1.add("13");

        String b = GenMethod.getSecondElement(arrayList1);
        System.out.println(b);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
