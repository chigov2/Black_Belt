package main.java.WorkWithFilles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\ANDREY\\Desktop\\M");
        Path anotherPath = Paths.get("C:\\Users\\ANDREY\\Desktop\\M\\N\\Z\\test20.txt");

        System.out.println("filePath.getFileName: " + filePath.getFileName());
        System.out.println("directoryPath.getFileName: " + directoryPath.getFileName());
        System.out.println("-----------------------");
        System.out.println("filePath.getParent: " + filePath.getParent());
        System.out.println("directoryPath.getParent: " + directoryPath.getParent());
        System.out.println("-----------------------");
        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        System.out.println("-----------------------");
        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute(): " + directoryPath.isAbsolute());
        System.out.println("-----------------------");
        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath(): " + directoryPath.toAbsolutePath());
        System.out.println("-----------------------");
        System.out.println("directoryPath.resolve(filePath): " + directoryPath.resolve(filePath));
        System.out.println("-----------------------");
        System.out.println("directoryPath.relativize(anotherPath): " +  directoryPath.relativize(anotherPath));
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        if(!Files.exists(directoryPath)){
            Files.createFile(directoryPath);
        }
        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        System.out.println("-----------------------");
        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isReadable(directoryPath): " + Files.isReadable(directoryPath));
        System.out.println("Files.isWritable(directoryPath): " + Files.isWritable(directoryPath));
        System.out.println("Files.isExecutable(directoryPath): " + Files.isExecutable(directoryPath));
        System.out.println("-----------------------");
        System.out.println("Files.size(filePath): " + Files.size(filePath));
        System.out.println("-----------------------");
        System.out.println("Files.getAttribute(filePath,attr): " + Files.getAttribute(filePath,"creationTime"));
        System.out.println("-----------------------");
        System.out.println("Files.readAttributes(filePath,*: " + Files.readAttributes(filePath,"*"));
        System.out.println("-----------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath,"*");
        for (Map.Entry<String, Object> attribute: attributes.entrySet()){
            System.out.println(attribute.getKey() + " : " + attribute.getValue());
        }

    }
}
