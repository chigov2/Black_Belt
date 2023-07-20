package main.java.Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", 'm', 50, 4, 4.6);
        Student student2 = new Student("Alex", 'm', 25, 3, 5.6);
        Student student3 = new Student("Lena", 'f', 50, 2, 7.6);
        Student student4 = new Student("Max", 'm', 15, 1, 9.6);
        Student student5 = new Student("Vova", 'm', 52, 4, 7.3);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied mathematics");
        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);
        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);

        List<Faculty> facultyList= new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);
        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));
    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}
