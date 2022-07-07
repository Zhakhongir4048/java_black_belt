package Раздел_9_Работа_с_файлами_IO_и_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) throws IOException {
        String rubaiyat = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.";
        try (FileWriter writer = new FileWriter("test_for_io.txt", true)) {
            for (int i = 0; i < rubaiyat.length(); i++) {
                writer.write(rubaiyat.charAt(i));
            }
            System.out.println("Done!");
        }
    }

}
/*
Character Streams and Byte Streams
Stream (поток) для работы с файлами – это
упорядоченная последовательность данных
Файлы разделяют на
• читабельные для человека – text files;
• нечитабельные для человека – binary files.
При работе с текстовыми и бинарными файлами нам
необходимо использовать разные типы Stream.
-------------------------------------------------------------
FileReader & FileWriter
FileReader и FileWriter используются для работы с
текстовыми файлами.
FileWriter writer = new FileWriter(“file1.txt”);
FileReader reader= new FileReader(“file1.txt”);
Никогда не забывайте закрывать Stream после
использования.
*/