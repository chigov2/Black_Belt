package main.java.WorkWithFilles;

import java.io.*;

public class CopyEx1 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt")))
        {
//            int character;
//            while((character = reader.read()) != -1){
//                writer.write(character);
//            }

            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.write("\n");
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
