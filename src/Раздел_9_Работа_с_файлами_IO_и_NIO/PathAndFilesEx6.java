package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx6 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        String dialog = "-Привет\n-Привет\n-Как дела?\n-Хорошо! Как у тебя?\n-Тоже хорошо!";
        Files.write(filePath, dialog.getBytes(StandardCharsets.UTF_8));
        List<String> strings = Files.readAllLines(filePath);
        for (String string : strings) {
            System.out.println(string);
        }
    }

}