package main.java.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("11");
        list.add("1231343543");
        list.add("1142314321");
        list.add("5435454353453453411");
        list.add("1543453453454353453453451");

//        for (int i = 0; i < list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = (List<Integer>) list.stream().map(el->el.length());
        System.out.println(list);
    }

}
