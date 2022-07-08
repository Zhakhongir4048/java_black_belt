package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами");
        // Имя файла или директории возвращает
        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("------------------");
        // Находим родителя файла или директории
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("------------------");
        // Находим корень файла или директории
        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("------------------");
        // Работаем ли мы с абсолютным путём?
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("------------------");
        // Смотрим абсолютный путь
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("------------------");
        // Смотрим родителя абсолютного пути
        System.out.println("filePath.toAbsolutePath().getParent() " +
                filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getParent() " +
                directoryPath.toAbsolutePath().getParent());
        System.out.println("------------------");
        // Смотрим родителя абсолютного пути;
        System.out.println("directoryPath.resolve(filePath) " +
                directoryPath.resolve(filePath));
        System.out.println("------------------");

        Path anotherPath = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами\\N\\Z\\test20.txt");
        // Находим относительный путь
        System.out.println("directoryPath.relativize(anotherPath) " +
                directoryPath.relativize(anotherPath));
        System.out.println("------------------");

        // Проверяю, существует ли файл
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        // Проверяю, существует ли директория
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath) " +
                Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " +
                Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " +
                Files.isExecutable(filePath));
        System.out.println("------------------");
        // Ссылаются пути, указанных в параметрах на один и тот же файл
        Path filePath2 = Paths.get("C:\\Users\\79998\\Documents\\Мои проекты\\java_black_belt\\test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " +
                Files.isSameFile(filePath, filePath2));
        System.out.println("------------------");
        System.out.println("Files.size(filePath) " +
                Files.size(filePath));
        System.out.println("------------------");
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " +
                Files.getAttribute(filePath, "creationTime"));
        System.out.println("------------------");
        System.out.println("Files.getAttribute(filePath, \"size\") " +
                Files.getAttribute(filePath, "size"));
        System.out.println("------------------");
        Map<String, Object> readAttributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> map : readAttributes.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

}