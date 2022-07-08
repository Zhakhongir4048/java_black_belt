package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer2;


import Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin"))) {
            Employee bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
        }
    }

}