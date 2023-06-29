package main.java.Collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Max",'m',15,1,5.8);
        Student st2 = new Student("Mike",'m',50,4,6.8);
        Student st3 = new Student("Lena",'f',45,5,4.8);
        Student st4 = new Student("Alla",'f',60,3,5.2);
        Student st5 = new Student("Victor",'m',30,2,5.0);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
//        studentArrayList.add(st6);
        System.out.println(studentArrayList);
        Student st6 = new Student("Victor",'m',30,2,5.0);

//        studentArrayList.remove(st6);
        int index = studentArrayList.indexOf(st6);
        System.out.println(studentArrayList);
        System.out.println("--");
        System.out.println(index);
    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student(String name, char sex, int age,int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avrGrade, avrGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}
