package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTree {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами");
        Files.walkFileTree(path, new MyFileVisitor());
    }

}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

}
/*
enum FileVisitResult
Значения FileVisitResult:
CONTINUE – означает, что нужно продолжать обход по
файлам;
TERMINATE – означает что нужно немедленно прекратить обход по файлам;
SKIP_SUBTREE – означает, что в данную директорию
заходить не надо;
SKIP_SIBLINGS – означает, в данной директории
продолжать обход по файлам не нужно.
*/