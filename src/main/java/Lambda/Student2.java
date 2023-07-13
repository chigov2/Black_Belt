package main.java.Lambda;

public class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avrGrade;

    public Student2(String name, char sex, int age, int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student2 {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
