package main.java.WorkWithFilles.programmer2;

import main.java.WorkWithFilles.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        Employee bestEmployee1;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("Employees2.bin")
        )){
            bestEmployee = (Employee) inputStream.readObject();
            bestEmployee1 = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
            System.out.println(bestEmployee1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
