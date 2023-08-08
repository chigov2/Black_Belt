package main.java.WorkWithFilles;

import java.io.*;

public class DataStreamsEx1 {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream outputStream =  new DataOutputStream(new FileOutputStream("test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("test.bin"))){

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeChar('e');
            outputStream.writeLong(1_000L);
            outputStream.writeFloat(3.14F);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());

        }
    }
}
