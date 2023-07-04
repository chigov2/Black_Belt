package main.java.Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(25,"Mike Stoba");
        map1.put(258,"Max Stoba");
        map1.put(100,"Lena Gerasiliuk");
        map1.put(5,"Vova Sokirko");
        map1.put(2,"Yura Olivko");
        map1.putIfAbsent(2,"ttt");
        System.out.println(map1);
        System.out.println(map1.get(25));
    }
}
