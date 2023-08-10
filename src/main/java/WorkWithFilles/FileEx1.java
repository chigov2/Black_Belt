package main.java.WorkWithFilles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test10.txt");
        File file1 = new File("test11.txt");
        File file2 = new File("C:\\Users\\ANDREY\\Desktop\\x1\\test20.txt");
        File folder = new File("C:\\Users\\ANDREY\\Desktop\\x");
        File folder1 = new File("C:\\Users\\ANDREY\\Desktop\\x1");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("--------------");
        System.out.println("file Is absolute: " + file.isAbsolute());
        System.out.println("folder Is absolute: " + folder.isAbsolute());
        System.out.println("--------------");
        System.out.println("file.isDirectory: " + file.isDirectory());
        System.out.println("folder.isDirectory: " + folder.isDirectory());
        System.out.println("--------------");
        System.out.println("file1.exists: " + file.exists());
        System.out.println("file2.exists: " + file2.exists());
        System.out.println("folder1.exists: " + folder1.exists());
        System.out.println("--------------");
        System.out.println("file1.createNewFile: " + file1.createNewFile());
        System.out.println("folder1.mkdir: " + folder1.mkdir());
        System.out.println("--------------");
        System.out.println("file2.length: "+file2.length());
        System.out.println("folder1.length: "+folder1.length());
        System.out.println("--------------");
//        System.out.println("file2.delete" + file2.delete());
        System.out.println("--------------");
        File[] files = folder1.listFiles();
        for (File f: files){
            System.out.println(f);
        }
        System.out.println("--------------");
        System.out.println("Analog: " + Arrays.toString(files));
        System.out.println("--------------");
        System.out.println("file2.isHidden: " + file2.isHidden());
        System.out.println("--------------");
        System.out.println("file2.canRead: " + file2.canRead());
        System.out.println("--------------");
        System.out.println("file2.canWrite: " + file2.canWrite());
        System.out.println("--------------");
        System.out.println("file2.canExecute: " + file2.canExecute());
        System.out.println("--------------");

    }
}
