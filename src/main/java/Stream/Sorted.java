package main.java.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        int[] array01 = {2,3,6,45,89,56,4,8,3};
        array01 = Arrays.stream(array01).sorted().toArray();
        System.out.println(Arrays.toString(array01));
        System.out.println("----");

        Student01 student1 = new Student01("Mike", 'm', 50, 4, 4.6);
        Student01 student2 = new Student01("Alex", 'm', 25, 3, 5.6);
        Student01 student3 = new Student01("Lena", 'f', 50, 2, 7.6);
        Student01 student4 = new Student01("Max", 'm', 15, 1, 9.6);
        Student01 student5 = new Student01("Vova", 'm', 52, 4, 7.3);
        List<Student01> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
//        students = students.stream().sorted().collect(Collectors.toList());
//        students = students.stream().sorted((x,y)-> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        students = students.stream().sorted((x,y)-> x.getAge()-(y.getAge())).collect(Collectors.toList());
        System.out.println(students);
    }
}
class Student01 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student01(String name, char sex, int age, int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    public void setAvrGrade(double avrGrade) {
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student01 {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
