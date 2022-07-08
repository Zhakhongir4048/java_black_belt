package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees1.bin"))) {
            List<?> employees = (ArrayList<?>) inputStream.readObject();
            System.out.println(employees);
        }
    }

}