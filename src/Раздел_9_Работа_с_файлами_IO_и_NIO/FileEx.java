package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {

    public static void main(String[] args) throws IOException {
        // Относительный путь
        File file = new File("test2.txt");
        // Абсолютный путь
        File folder = new File("C:\\Users\\79998\\Desktop\\обои\\Работа с файлами");
        File deleteFile = new File("test_delete.txt");
        // Получаем абсолютный путь
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("----------------------");
        // Абсолютный ли файл?
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("----------------------");
        // Является ли файл директорией, папка ли это?
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("----------------------");
        // Проверят, существует ли наш файл
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println("----------------------");
        // Создаёт файл первый метод, второй метод создаёт директорию
        System.out.println(file.createNewFile());
        System.out.println(folder.mkdir());
        System.out.println("----------------------");
        // Узнаём размер файла
        System.out.println(file.length());
        System.out.println(folder.length());
        System.out.println("----------------------");
        // Удаляем папки и файлы с помощью delete
        System.out.println(deleteFile.delete());
        System.out.println(folder.length());
        System.out.println("----------------------");
        // Проверяем содержимое папки
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("----------------------");
        // Скрыта ли наша папка?
        System.out.println(folder.isHidden());
        System.out.println("----------------------");
        // Есть ли у нас доступ на чтение этого файла
        System.out.println(file.canRead());
        System.out.println(folder.canRead());
        System.out.println("----------------------");
        // Есть ли у нас доступ на запись этого файла
        System.out.println(file.canWrite());
        System.out.println(folder.canWrite());
        System.out.println("----------------------");
        // Есть ли у нас доступ на запуск этого файла
        System.out.println(file.canExecute());
        System.out.println(folder.canExecute());
        System.out.println("----------------------");
    }

}
/*
Класс File позволяет управлять информацией о
файлах и директориях.
File file = new File (“test1.txt”);
getAbsolutePath isAbsolute isDirectory exists
createNewFile mkdir length delete listFiles
isHidden canRead canWrite canExecute
*/