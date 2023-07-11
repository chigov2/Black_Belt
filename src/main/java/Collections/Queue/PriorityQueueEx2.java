package main.java.Collections.Queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student student1 = new Student("Mike",5);
        Student student2 = new Student("Max",3);
        Student student3 = new Student("Alex",4);
        Student student4 = new Student("Lena",2);
        Student student5 = new Student("Luda",1);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);
        System.out.println(priorityQueue);
        System.out.println("poll - удаление: " + priorityQueue.poll());
        System.out.println("poll - удаление: " + priorityQueue.poll());
        System.out.println("poll - удаление: " + priorityQueue.poll());
        System.out.println("priorityQueue: " + priorityQueue);
    }
}

final class Student implements Comparable<Student>{
    final String name;
    final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - (o.course);
    }

}
