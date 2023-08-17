package main.java.PrintfFormat;

public class PrintfEx1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10,"Mike","Stoba",1000,0.15);
        Employee employee2 = new Employee(13,"Max","Stoba",2000,0.2);
        Employee employee3 = new Employee(15,"Lena","Gerasymliuk",1000,0.5);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.2f", 1,"Mikee", "Chigov", 2000.2);
        System.out.println(newString);


    }

    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.2f \n",employee.id, employee.name,
                employee.surname, employee.salary*(1+employee.bonus));
    }

}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }
}
