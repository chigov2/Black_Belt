package main.java.Collections.MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap1 = new TreeMap<>();
        TreeMap<Student,Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        Student student1 = new Student("Mike","Stoba", 4);
        Student student2 = new Student("Max","Stoba", 3);
        Student student3 = new Student("Lena","Gerasymliuk", 5);
        Student student4 = new Student("Igor","Kol", 4);
        Student student5 = new Student("Anna","Kovalchuk", 3);
        Student student6 = new Student("Alex","Gerasymliuk", 5);
        Student student7 = new Student("Alla","Gerasymliuk", 5);

        treeMap1.put(student1,2.8);
        treeMap1.put(student5,5.8);
        treeMap1.put(student2,5.9);
        treeMap1.put(student7,6.7);
        treeMap1.put(student3,9.8);
        treeMap1.put(student6,5.5);
        treeMap1.put(student4,4.8);
        System.out.println(treeMap1);
    }
}
