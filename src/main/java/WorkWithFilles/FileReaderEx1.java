package main.java.WorkWithFilles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args)  {
        FileReader reader = null;
        try {
            reader = new FileReader("test2.txt");
            int character = 0;
            while (true){
                try {
                    if ((character = reader.read()) == -1) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print((char)character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("\nDone");
    }
}
