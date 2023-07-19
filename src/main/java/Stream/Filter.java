package main.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 'm', 50, 4, 4.6);
        Student student2 = new Student("Alex", 'm', 25, 3, 5.6);
        Student student3 = new Student("Lena", 'f', 50, 2, 7.6);
        Student student4 = new Student("Max", 'm', 15, 1, 9.6);
        Student student5 = new Student("Vova", 'm', 52, 4, 7.3);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students = students.stream().filter(element->
                element.getAge()>22 && element.getAvrGrade()< 7.2)
                .collect(Collectors.toList());

        System.out.println("students 22 && 7.2: "+students);

        Stream<Student> studentStream = Stream.of(student1,student2,student3,student4);
        studentStream.filter(element->
                element.getAge()>22 && element.getAvrGrade()< 7.2)
                .collect(Collectors.toList());
        System.out.println("studentStream 22 && 7.2: "+studentStream);
    }
}
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student(String name, char sex, int age, int course, double avrGrade) {
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
        return "Student {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
