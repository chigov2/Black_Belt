package main.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(10);
        arrayList.add(150);
        arrayList.add(12);
        arrayList.add(-50);
        arrayList.add(78);
        arrayList.add(4);
        arrayList.add(61);
        arrayList.add(24);
        arrayList.add(35);
        System.out.println(arrayList);
        System.out.println("-------------");
        Collections.sort(arrayList);
        System.out.println("sort "+arrayList);

        Collections.reverse(arrayList);
        System.out.println("reverse "+arrayList);

        Collections.shuffle(arrayList);
        System.out.println("shuffle "+arrayList);

//        int index1 = Collections.binarySearch(arrayList,10);
//        System.out.println(index1);

Employee1 employee1 = new Employee1(100,1000,"Mike","Stoba");
Employee1 employee2 = new Employee1(12,2000,"Lena","Stoba");
Employee1 employee3 = new Employee1(360,3000,"Max","Stoba");
Employee1 employee4 = new Employee1(98,4000,"Alex","Stoba");
Employee1 employee5 = new Employee1(98,5000,"Alla","Stoba");
Employee1 employee6 = new Employee1(2540,6000,"Vova","Stoba");
Employee1 employee7 = new Employee1(256,7000,"Luda","Stoba");

List<Employee1> employee1List = new ArrayList<>();
        employee1List.add(employee1);
        employee1List.add(employee2);
        employee1List.add(employee3);
        employee1List.add(employee4);
        employee1List.add(employee5);
        employee1List.add(employee6);
        employee1List.add(employee7);
        System.out.println(employee1List);
        System.out.println("----------");
        Collections.sort(employee1List);
        System.out.println(employee1List);
        int index2 = Collections.binarySearch(employee1List,new Employee1(2540,6000,"Vova","Stoba"));
        System.out.println("----");
        System.out.println(index2);
        System.out.println("----");
        int[]array = {-3,5,12,6,9,8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,9);
        System.out.println(index3);
    }

}
class Employee1 implements Comparable<Employee1>{
    int id;
    int salary;
    String name;
    String lastName;

    public Employee1(int id, int salary, String name, String lastName) {
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
    public int compareTo(Employee1 anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result ==0 ){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }

}

