package main.java.Collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        Student55 st1 = new Student55("Mike", 1);
        Student55 st2 = new Student55("Lena", 2);
        Student55 st3 = new Student55("Masha", 3);
        Student55 st4 = new Student55("Alex", 4);
        Student55 st5 = new Student55("Vova", 5);
        Student55 st6 = new Student55("Helen", 5);
        Student55 st7 = new Student55("Bernard", 5);

        LinkedList<Student55> linkedList = new java.util.LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.add(st6);
        System.out.println("---");
        System.out.println(linkedList);
        linkedList.add(2,st7);
        System.out.println("---");
        System.out.println(linkedList);
        System.out.println("---");
        for (int i =0; i <linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

    }
}

class Student55 {
    String name;
    int course;

    public Student55(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
