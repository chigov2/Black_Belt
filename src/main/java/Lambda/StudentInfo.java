package main.java.Lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student("Mike",'m',50,4,4.6);
        Student student2 = new Student("Alex",'m',25,3,5.6);
        Student student3 = new Student("Lena",'f',50,2,7.6);
        Student student4 = new Student("Max",'m',15,1,9.6);
        Student student5 = new Student("Vova",'m',52,4,7.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
    }
}
