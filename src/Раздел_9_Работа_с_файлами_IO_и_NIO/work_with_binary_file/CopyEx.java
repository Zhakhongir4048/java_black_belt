package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx {

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\79998\\Desktop\\обои\\spring.png");
             FileOutputStream fileOutputStream = new FileOutputStream("spring.png")) {
            int character;
            while ((character = fileInputStream.read()) != -1) {
                fileOutputStream.write(character);
            }
        }
    }

}
/*
FileInputStream & FileOutputStream
FileInputStream и FileOutputStream используются для
работы с бинарными файлами.
FileInputStream inputStream =
new FileInputStream(“test2.bin”);
FileOutputStream outputStream =
new FileOutputStream(“test2.bin”);
*/