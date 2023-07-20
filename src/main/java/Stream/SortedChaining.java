package main.java.Stream;

import main.java.Lambda.Student2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedChaining {
    public static void main(String[] args) {
        int[] array01 = {2,3,6,45,4,8,3};
//        array01 = Arrays.stream(array01).sorted().toArray();
        System.out.println(Arrays.toString(array01));
        System.out.println("----");

        int result = Arrays.stream(array01).filter(e->e%2 == 1)
                .map(e->{if (e%3 == 0){e = e /3;} return e;})//всли есть остаток, то деление не делается и результат сразу возвращается
//                .reduce((a,e)->a+e).getAsInt();
                .reduce(Integer::sum).getAsInt();
        System.out.println(result);
        System.out.println("--------------");
//увеличить буквы в именах студентов
        List<Student02> students02 = new ArrayList<>();
        Student02 student1 = new Student02("Mike", 'm', 50, 4, 4.6);
        Student02 student2 = new Student02("Alex", 'm', 25, 3, 5.6);
        Student02 student3 = new Student02("Lena", 'f', 50, 2, 7.6);
        Student02 student4 = new Student02("Max", 'm', 15, 1, 9.6);
        Student02 student5 = new Student02("Alla", 'f', 62, 4, 7.3);

        students02.add(student1);
        students02.add(student2);
        students02.add(student3);
        students02.add(student4);
        students02.add(student5);

        students02.stream().map(element->
        {
            element.setName(element.getName().toUpperCase());
            return element;
        })
        .filter(element->element.getSex() == 'f')
        .sorted((x, y) -> x.getAge() - y.getAge())
//        .forEach(element-> System.out.println(element));
        .forEach(System.out::println);
    }
}

class Student02 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student02(String name, char sex, int age, int course, double avrGrade) {
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
        return "Student02 {" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
