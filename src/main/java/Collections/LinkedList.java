package main.java.Collections;
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
Student55 st1 = new Student55("Mike",1);
Student55 st2 = new Student55("Lena",2);
Student55 st3 = new Student55("Masha",3);
Student55 st4 = new Student55("Alex",4);
Student55 st5 = new Student55("Vova",5);

java.util.LinkedList<Student55> linkedList = new java.util.LinkedList<>();
linkedList.add(st1);
linkedList.add(st2);
linkedList.add(st3);
linkedList.add(st4);
linkedList.add(st5);
 }
}
class Student55{
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
