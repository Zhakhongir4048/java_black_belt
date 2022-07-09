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
/*
Interface Path & class Files
Объект типа Path представляет собой путь к файлу или
директории.
Path path = Paths.get(“text1.txt”);
path.getFileName() path.getParent() path.getRoot()
path.is Absolute() path.toAbsolutePath()
path1.resolve(path2) path1.relativize(path2)
Interface Path & class Files
Files.exists(path)
Files.createFile(path) Files.createDirectory(path)
Files.isReadable() Files.isWritable() Files.isExecutable()
Files.isSameFile(path1, path2) Files.size()
Files.getAttribute(path, attribute_name)
Files.readAttributes(path, attributes)
Interface Path & class Files
Files.copy(path1, path2, copy_options)
Files.delete(path)
Files.write(path, byte_array)
Files.readAllLines(path)
Files.move(path1, path2, copy_options)
Files.walkFileTree
Метод Files.walkFileTree(Path start, FileVisitor visitor) используется
для обхода дерева файлов.
Логика обхода дерева файлов заключается в классе,
имплементирующем интерфейс FileVisitor.
preVisitDirectory - срабатывает перед обращением к элементам
папки;
visitFile - срабатывает при обращении к файлу;
postVisitDirectory - срабатывает после обращения ко всем
элементам папки;
visitFileFailed - срабатывает когда файл по каким-то причинам
недоступен.
*/