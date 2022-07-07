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