package main.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
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
        Map<Integer, List<Student>> listMap = students.stream()
                .map(el->{el.setName(el.getName().toUpperCase());
        return el;})
                .collect(Collectors.groupingBy(el->el.getCourse()));

        System.out.println("-----Map.Entry-------");

        for (Map.Entry<Integer, List<Student>> entry: listMap.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }

        System.out.println("-----partitionBy---------");

        Map<Boolean, List<Student>> listMap2 = students.stream().collect(Collectors.partitioningBy(el->el.getAvrGrade()>7));

        for (Map.Entry<Boolean, List<Student>> entry: listMap2.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
