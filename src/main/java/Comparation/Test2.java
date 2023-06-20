package main.java.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(2,2000,"Mike","Stoba");
        Employee emp2 = new Employee(3,2500,"Max","Stoba");
        Employee emp3 = new Employee(4,3000,"Lena","Gerasymliuk");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println("Before sorting: " + employeeList);
        Collections.sort(employeeList);
        System.out.println("After: " + employeeList);
    }

}
class Employee implements Comparable<Employee>{
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
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        }else if (this.id < anotherEmp.id){
//            return -1;
//        }else return 1;
//    }
//        return this.id-anotherEmp.id;
        int result = this.name.compareTo(anotherEmp.name);
        if (result ==0){result = this.lastName.compareTo(anotherEmp.lastName);}
        return result;
}
}
