package main.java.WorkWithFilles.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Bently","Black");
        Car car1 = new Car("BMW","red");

        Employee employee = new Employee("Mike","Stoba","IT",6000,car);
        Employee employee1 = new Employee("Max","Stoba","HR",6000, car1);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Employees2.bin"))){
                    outputStream.writeObject(employee);
                    outputStream.writeObject(employee1);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
