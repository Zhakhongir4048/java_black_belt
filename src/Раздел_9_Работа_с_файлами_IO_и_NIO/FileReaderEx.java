package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("test_for_io.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        }
        System.out.println();
        System.out.println("Done!");
    }

}