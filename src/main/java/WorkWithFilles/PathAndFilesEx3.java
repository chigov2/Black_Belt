package main.java.WorkWithFilles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
         Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//
//        String dialog = "some text";
//
//        Files.write(filePath, Collections.singleton(dialog));
////        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String l : list){
            System.out.println(l);
        }

    }

}
