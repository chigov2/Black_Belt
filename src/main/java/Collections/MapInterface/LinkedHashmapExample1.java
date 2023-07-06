package main.java.Collections.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashmapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> linkedHashMap = new LinkedHashMap<>(16,0.78f,false);
        Student student1 = new Student("Mike","Stoba", 4);
        Student student2 = new Student("Max","Stoba", 3);
        Student student3 = new Student("Lena","Gerasymliuk", 5);
        Student student4 = new Student("Igor","Kol", 4);
        Student student5 = new Student("Anna","Kovalchuk", 3);
        Student student6 = new Student("Alex","Gerasymliuk", 5);
        Student student7 = new Student("Alla","Gerasymliuk", 5);
        linkedHashMap.put(6.7,student3);
        linkedHashMap.put(7.7,student2);
        linkedHashMap.put(8.7,student1);
        linkedHashMap.put(9.7,student7);
        linkedHashMap.put(3.7,student5);
        linkedHashMap.put(4.7,student6);
        linkedHashMap.put(5.7,student4);

        System.out.println(linkedHashMap);
        System.out.println("get 3.7: "+ linkedHashMap.get(3.7));
        System.out.println("get 4.7: "+ linkedHashMap.get(4.7));
        System.out.println(linkedHashMap);
    }
}
