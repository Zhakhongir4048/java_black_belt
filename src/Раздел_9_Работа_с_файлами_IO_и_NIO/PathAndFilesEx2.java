package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами");
        Path directoryPath2 = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами 2");
        Files.copy(filePath, directoryPath.resolve(filePath),
                StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(directoryPath2, directoryPath.resolve("Работа с файлами 2"));
        System.out.println("Done!");
    }

}