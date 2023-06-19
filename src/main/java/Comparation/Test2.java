package main.java.Comparation;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
    }

}
class Employee{
    int id;
    int salary;
    String name;
    String lastName;

    public Employee(int id, int salary, String name, String lastName) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "id=" + id +
                ", salary=" + salary +
                ", namme='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
