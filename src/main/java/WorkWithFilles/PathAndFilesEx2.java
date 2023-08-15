package main.java.WorkWithFilles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\1111\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\1111\\Desktop\\B");

//        Files.copy(filePath,directoryPath.resolve(filePath)
//        , StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath,directoryPath.resolve("test16.txt"));
//        Files.copy(directoryBPath,directoryPath.resolve("B"));
        System.out.println("----------------");
//Files.move(filePath,directoryPath.resolve(filePath));
        System.out.println("----------------");
//Files.move(Paths.get("test10.txt"),Paths.get("test110.txt"));
        System.out.println("----------------");

//        Files.delete(Paths.get("test5.txt"));
        Files.delete(directoryPath);
        System.out.println("Done");
    }
}
