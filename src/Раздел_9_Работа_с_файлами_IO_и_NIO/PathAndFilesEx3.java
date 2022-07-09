package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx3 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами");
        // move - перемещает
        Files.move(filePath, directoryPath.resolve("test15.txt"));
    }

}