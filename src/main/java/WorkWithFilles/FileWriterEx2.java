package main.java.WorkWithFilles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
    public static void main(String[] args) throws IOException {
        String rubai = "\nСколько, дерзкая, ни жди —\n" +
                "Лишь досада впереди.\n" +
                "Глупостей не делай вновь\n" +
                "И найдёшь свою любовь…\n";
        String s = "Hello";

        try (FileWriter writer = new FileWriter("test2.txt", true)) {
//            writer = new FileWriter("C:\\Users\\ANDREY\\Desktop\\test1.txt");
//            for (int i = 0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

