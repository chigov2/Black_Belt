package main.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 'm', 50, 4, 4.6);
        Student student2 = new Student("Alex", 'm', 25, 3, 5.6);
        Student student3 = new Student("Lena", 'f', 50, 1, 7.6);
        Student student4 = new Student("Max", 'm', 15, 1, 9.6);
        Student student5 = new Student("Vova", 'm', 52, 4, 7.3);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

       List<Integer> courses =  students.stream().mapToInt(el->el.getCourse())
               .boxed()//int to Integer
               .collect(Collectors.toList());
        System.out.print("Courses: ");

        System.out.println(courses);
        System.out.println("======sum=======");
        int summ = students.stream().mapToInt(el->el.getAge()).sum();
        System.out.println(summ);
        System.out.println("----min------");
        int min = students.stream().mapToInt(el->el.getAge()).min().getAsInt();
        System.out.println(min);
        System.out.println("======averageum=======");
        Double average = students.stream().mapToInt(el->el.getAge()).average().getAsDouble();
        System.out.println(average);
        System.out.println("----max------");
        int max = students.stream().mapToInt(el->el.getAge()).max().getAsInt();
        System.out.println(max);
    }

}
