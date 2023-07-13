package main.java.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade) {
        for (Student student : arrayList) {
            if (student.avrGrade > grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student student : arrayList) {
            if (student.age > age) {
                System.out.println(student);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
        for (Student student : arrayList) {
            if (student.age > age && student.avrGrade > grade && student.sex == sex) {
                System.out.println(student);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 'm', 50, 4, 4.6);
        Student student2 = new Student("Alex", 'm', 25, 3, 5.6);
        Student student3 = new Student("Lena", 'f', 50, 2, 7.6);
        Student student4 = new Student("Max", 'm', 15, 1, 9.6);
        Student student5 = new Student("Vova", 'm', 52, 4, 7.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        StudentInfo studentInfo = new StudentInfo();

        System.out.println("sorting-----------");
        //так можно не делать, а сразу вставлять лямбда
//        Collections.sort(students, new Comparator<Student>() {
//                    @Override
//                    public int compare(Student o1, Student o2) {
//                        return o1.course - o2.course;
//                    }
//                }
//        );

//        Collections.sort(students,(Student o1, Student o2)->{return o1.course - o2.course;});
        Collections.sort(students,(s11, s12)->{return s11.course - s12.course;});
        System.out.println(students);
        System.out.println("---------------");
        studentInfo.printStudentsMixCondition(students,40,4,'m');
        System.out.println("---------------");

        studentInfo.printStudentsOverGrade(students, 6);
        System.out.println("---------------");
        studentInfo.printStudentsUnderAge(students, 26);
    }

}
