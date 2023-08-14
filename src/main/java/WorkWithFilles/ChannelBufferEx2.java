package main.java.WorkWithFilles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            //читаем информацию из файла в буфер
            channel.read(buffer);
            buffer.flip();//чтобы можно было читать из буфера
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println("------rewind--------");
            buffer.rewind();
            System.out.println((char) buffer.get());
            System.out.println("------compact--------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();//чтобы можно было читать из буфера
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            buffer.clear();//position переходит на ноль
            System.out.println("------reset--------");
            channel.read(buffer);
            buffer.flip();//чтобы можно было читать из буфера
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println("------reset--------");
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
