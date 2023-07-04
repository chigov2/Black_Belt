package main.java.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(4,3000,"Lena","Gerasymliuk");
        Employee emp2 = new Employee(2,2000,"Mike","Stoba");
        Employee emp3 = new Employee(3,2500,"Max","Stoba");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println("Before sorting: " + employeeList);
//        Collections.sort(employeeList,new IdComparator());
        Collections.sort(employeeList);

        System.out.println("After: " + employeeList);
        System.out.println("name--------------");
//        Collections.sort(employeeList,new NameComparator());
        Collections.sort(employeeList,new SalaryComparator());
        System.out.println(employeeList);
    }

}
class Employee implements Comparable<Employee>
{
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
        if (this.id == anotherEmp.id) {
            return 0;
        }else if (this.id < anotherEmp.id){
            return -1;
        }else return 1;
    }
//        return this.id-anotherEmp.id;
//        int result = this.name.compareTo(anotherEmp.name);
//        if (result ==0){result = this.lastName.compareTo(anotherEmp.lastName);}
//        return result;

}
//class IdComparator implements Comparator<Employee>{
//    @Override
//    public int compare(Employee employee1, Employee employee2) {
//        if (employee1.id == employee2.id) {
//            return 0;
//        }else if (employee1.id < employee2.id){
//            return -1;
//        }else return 1;
//    }
//}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {

        return employee1.name.compareTo(employee2.name);
    }
}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {

        return employee1.salary-(employee2.salary);
    }
}
