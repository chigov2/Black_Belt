package main.java.Collections.MapInterface;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Mike","Stoba", 4);
        Student student2 = new Student("Max","Stoba", 3);
        Student student3 = new Student("Lena","Gerasymliuk", 5);
        map.put(student1,7.5);
        map.put(student2,8.5);
        map.put(student3,7.9);
        System.out.println(map);

        Student student4 = new Student("Mike","Stoba", 4);
        Student student5 = new Student("Vova","Sokirko", 5);
        Student student6 = new Student("Alla","Gera1234", 4);

        boolean result = map.containsKey(student4);
        System.out.println("result map.containsKey(student4) = " + result);
        System.out.println("equals st1 and st4: " + student1.equals(student4));

        System.out.println("student1 hashcode: " + student1.hashCode());
        System.out.println("student4 hashcode: " + student4.hashCode());
        System.out.println("student3 hashcode: " + student3.hashCode());
        System.out.println("------");
        System.out.println("student5 hashcode: " + student5.hashCode());
        System.out.println("student6 hashcode: " + student6.hashCode());
        System.out.println("-----------");

        for (Map.Entry<Student,Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + ";" +entry.getValue());
        }
        System.out.println("-----------");

        Map<Integer, String> map2 = new HashMap<>(16,0.75f);

    }
}

class Student{
    String name;
    String lastName;
    int course;

    public Student(String name, String lastName, int course) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, course);
    }
//    @Override
//    public int hashCode() {
//        return name.length()*71 + lastName.length()*11 + course*53;
//    }
}