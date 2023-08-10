package main.java.WorkWithFilles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("test10.txt","rw")){


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
