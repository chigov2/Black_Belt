package main.java.Lambda;

import java.util.ArrayList;

public class StudentInfo2 {

    void testStudents(ArrayList<Student2> students2, StudentsCheks studentsCheks) {
        for (Student2 st2 : students2) {
            if (studentsCheks.check2(st2)) {
                System.out.println(st2);
            }
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Mike", 'm', 50, 4, 4.6);
        Student2 student2 = new Student2("Alex", 'm', 25, 3, 5.6);
        Student2 student3 = new Student2("Lena", 'f', 50, 2, 7.6);
        Student2 student4 = new Student2("Max", 'm', 15, 1, 9.6);
        Student2 student5 = new Student2("Vova", 'm', 52, 4, 7.3);
        ArrayList<Student2> students2 = new ArrayList<>();
        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        students2.add(student4);
        students2.add(student5);
        StudentInfo2 studentInfo2 = new StudentInfo2();
        System.out.println("---------------");
        System.out.println("lambda---------------");
        studentInfo2.testStudents(students2,(Student2 s1)->{ return s1.age >25;});

        System.out.println("lambda Новое написание---------------");

        StudentsCheks st = (Student2 s1)->{ return s1.age >25;};
        studentInfo2.testStudents(students2,st);

        System.out.println("lambda short---------------");
        studentInfo2.testStudents(students2,s1-> s1.age >25);

        System.out.println("lambda short2---------------");
        studentInfo2.testStudents(students2,s2-> {return s2.age >25;});

        System.out.println("lambda short3---------------");
        studentInfo2.testStudents(students2,(Student2 s3)-> s3.age >25);

        System.out.println("lambda short4---------------");
        studentInfo2.testStudents(students2,(Student2 s3)-> {
            System.out.println("Hello");
            return s3.age >25;});

        System.out.println("lambda2---------------");
        studentInfo2.testStudents(students2,(Student2 s2)->{return s2.avrGrade >8;});
        System.out.println("lambda3---------------");
        studentInfo2.testStudents(students2,(Student2 q)->{return q.age > 25 && q.sex == 'f';});

    }

}

interface StudentsCheks {
    boolean check2(Student2 st2);
}


