package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PathAndFilesEx4 {

    public static void main(String[] args) throws IOException {
        // move - перемещает
        Files.move(Paths.get("test10.txt"), Paths.get("test11.txt"));
    }

}