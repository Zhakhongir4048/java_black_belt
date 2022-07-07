package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.*;

public class CopyEx2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test_for_io.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test3.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
        }
    }

}
/*
BufferedReader & BufferedWriter
Использование буферизации в Stream позволяет
достичь большей эффективности при чтении файла
или записи в него.
BufferedWriter writer =
new BufferedWriter (new FileWriter(“file1.txt”));
BufferedReader reader =
new BufferedReader (new FileReader(“file1.txt”));
*/