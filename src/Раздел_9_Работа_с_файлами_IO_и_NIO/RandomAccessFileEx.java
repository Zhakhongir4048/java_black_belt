package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            // Читаю один байт
            int a = file.read();
            System.out.println((char) a);
            // Читаю целую строку
            String s = file.readLine();
            System.out.println(s);
            // Перемещаемся к позиции, устанавливаем Pointer
            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);
            // Узнаём позицию
            long filePointer = file.getFilePointer();
            System.out.println("filePointer = " + filePointer);
            // Попадаем на последнюю позицию
            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");
        }
    }

}
/*
Класс RandomAccessFile позволяет читать
информацию из любого места файла и записывать
информацию в любое место файла.
RandomAccessFile file =
new RandomAccessFile (“test1.txt”, “rw”);
*/