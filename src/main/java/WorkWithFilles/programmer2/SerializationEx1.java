package main.java.WorkWithFilles.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {

        List<String> employees1;
        System.out.println("test0");
        try(ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream("employees1.bin")))
        {
                employees1 = (ArrayList)inputStream.readObject();
            System.out.println("test");
            System.out.println(employees1);
        }


        catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
