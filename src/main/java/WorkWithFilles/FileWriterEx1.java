package main.java.WorkWithFilles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) {
        String rubai = "\nСколько, дерзкая, ни жди —\n" +
                "Лишь досада впереди.\n" +
                "Глупостей не делай вновь\n" +
                "И найдёшь свою любовь…\n";
        String s  = "Hello";
        FileWriter writer = null;
        try {
//            writer = new FileWriter("C:\\Users\\ANDREY\\Desktop\\test1.txt");
            writer = new FileWriter("test2.txt", true);
//            for (int i = 0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
