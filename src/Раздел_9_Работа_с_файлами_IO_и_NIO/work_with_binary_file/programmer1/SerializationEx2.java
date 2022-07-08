package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

    public static void main(String[] args) throws IOException {
        Car car = new Car("Nissan", "white");
        Employee employee = new Employee("Мария", "Иванова", "IT", 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        }
    }

}