package main.java.WorkWithFilles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("test10.txt","rw");
            FileChannel channel = file.getChannel()){

            ByteBuffer buffer  = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            int byteRead = channel.read(buffer);//чатая из файла инфо, записываем в буфер

            System.out.println("byteRead: " + byteRead);
            while (byteRead > 0){
                System.out.println("Прочитано: " + byteRead);
                buffer.flip();
            //чтение из из буфера и запись в stih
                while (buffer.hasRemaining()){
                   stih.append((char)buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);//чатая из файла инфо, записываем в буфер
            }
            System.out.println(stih);

            String text = "\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit.";

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.length());
////            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
