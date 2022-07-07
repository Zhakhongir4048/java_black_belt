package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.*;

public class CopyEx {

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test_for_io.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test3.txt"))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                bufferedWriter.write(character);
            }
        }
    }

}