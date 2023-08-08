package main.java.WorkWithFilles;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) throws IOException{
//        try(FileInputStream inputStream = new FileInputStream("C:\\Users\\ANDREY\\Desktop\\file.jpg");
        try(FileInputStream inputStream = new FileInputStream("G:\\OneDrive2022\\OneDrive\\Desktop\\Мах.jpg");
            FileOutputStream outputStream = new FileOutputStream("file.jpg"))
        {
//            int character;
//            while((character = reader.read()) != -1){
//                writer.write(character);
//            }
        int i;
        while((i = inputStream.read()) != -1){
            outputStream.write(i);
        }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
