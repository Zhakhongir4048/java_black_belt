package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file;

import java.io.*;

public class DataStreamEx {

    public static void main(String[] args) throws IOException {
        try (DataOutputStream outputStream =
                     new DataOutputStream(
                             new FileOutputStream("my_test.bin"));
             DataInputStream dataInputStream =
                     new DataInputStream(
                             new FileInputStream("my_test.bin"))) {
            outputStream.writeBoolean(true);
            outputStream.writeInt(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(123.456);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readDouble());
        }
    }

}
/*
DataInputStream & DataOutputStream
DataInputStream и DataOutputStream позволяют
записывать в файл и читать из него примитивные
типы данных.
DataInputStream inputStream =
new DataInputStream (new FileInputStream(“test2.bin”));
DataOutputStream outputStream =
new DataOutputStream (new FileOutputStream(“test2.bin”));
*/