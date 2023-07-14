package main.java.Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("223243432423");
        arrayList.add("3321321");
        arrayList.add("44");
        arrayList.add("553");
        arrayList.add("661");
        arrayList.add("77324");
//        arrayList.removeIf(element->element.length()<4);
        Predicate<String> pr =element->element.length()<4;
        arrayList.removeIf(pr);
        System.out.println(arrayList);
    }
}
