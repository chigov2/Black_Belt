package main.java.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo2 {

    void testStudents(ArrayList<Student2> students2, Predicate<Student2> student2Predicate) {
        for (Student2 st2 : students2) {
            if (student2Predicate.test(st2)) {
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
        studentInfo2.testStudents(students2, (Student2 s1) -> {
            return s1.age > 25;
        });

        System.out.println("lambda Новое написание---------------");

//        StudentsCheks st = (Student2 s1)->{ return s1.age >25;};
//        studentInfo2.testStudents(students2,st);
        System.out.println("=========Predicate");
        Predicate<Student2> p2 = st -> st.age < 49;
        Predicate<Student2> p3 = st3 -> st3.course == 3;
        studentInfo2.testStudents(students2, p2.negate());
//        studentInfo2.testStudents(students2,p2.or(p3));
//        studentInfo2.testStudents(students2,p2.and(p3));


//        System.out.println("Predicate<Student2> p2 = st -> st.age < 49: " + );

        System.out.println("lambda short---------------");
        studentInfo2.testStudents(students2, s1 -> s1.age > 25);

        System.out.println("lambda short2---------------");
        studentInfo2.testStudents(students2, s2 -> {
            return s2.age > 25;
        });

        System.out.println("lambda short3---------------");
        studentInfo2.testStudents(students2, (Student2 s3) -> s3.age > 25);

        System.out.println("lambda short4---------------");
        studentInfo2.testStudents(students2, (Student2 s3) -> {
            System.out.println("Hello");
            return s3.age > 25;
        });

        System.out.println("lambda2---------------");
        studentInfo2.testStudents(students2, (Student2 s2) -> {
            return s2.avrGrade > 8;
        });
        System.out.println("lambda3---------------");
        studentInfo2.testStudents(students2, (Student2 q) -> {
            return q.age > 25 && q.sex == 'f';
        });

        double res = avgOfSomething(students2, studentF -> studentF.avrGrade);
        System.out.println("-----Function---------");
        System.out.println(res);
    }

    private static double avgOfSomething(List<Student2> list,
                                         Function<Student2, Double> f) {
        double result = 0;
        for (Student2 stu2 : list) {
            result += f.apply(stu2);
        }
        result = result / list.size();
        return result;
    }

}


