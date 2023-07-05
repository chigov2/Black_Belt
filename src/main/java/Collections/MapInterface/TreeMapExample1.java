package main.java.Collections.MapInterface;

import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Mike","Stoba", 4);
        Student student2 = new Student("Max","Stoba", 3);
        Student student3 = new Student("Lena","Gerasymliuk", 5);
        Student student4 = new Student("Igor","Kol", 4);
        Student student5 = new Student("Anna","Kovalchuk", 3);
        Student student6 = new Student("Alex","Gerasymliuk", 5);
        Student student7 = new Student("Alla","Gerasymliuk", 5);
        treeMap.put(3.7,student5);
        treeMap.put(4.7,student6);
        treeMap.put(5.7,student4);
        treeMap.put(6.7,student3);
        treeMap.put(7.7,student2);
        treeMap.put(8.7,student1);
        treeMap.put(9.7,student7);



        System.out.println(treeMap);
        System.out.println(treeMap.get(7.7));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(6.7));
        System.out.println(treeMap.headMap(6.7));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());



    }
}
