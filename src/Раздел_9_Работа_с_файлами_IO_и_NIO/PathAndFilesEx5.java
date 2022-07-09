package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx5 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Files.delete(filePath);
    }

}