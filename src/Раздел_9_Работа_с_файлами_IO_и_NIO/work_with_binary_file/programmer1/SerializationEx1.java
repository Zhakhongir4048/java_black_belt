package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) throws IOException {
        List<String> employeesName = new ArrayList<>();
        employeesName.add("Заур");
        employeesName.add("Иван");
        employeesName.add("Елена");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employeesName);
            System.out.println("Done!");
        }
    }

}
/*
Serialization
Сериализация - это процесс преобразования
объекта в последовательность байт.
Deserialization - это процесс восстановления
объекта, из этих байт.
ObjectInputStream inputStream =
new ObjectInputStream (new FileInputStream(“test2.bin”));
ObjectOutputStream outputStream =
new ObjectOutputStream (new FileOutputStream(“test2.bin”));
Serialization
Для того, чтобы объект класса можно было
serialization, класс должен имплементировать
интерфейс Serializable.
Поля класса, помеченные ключевым словом transient,
не записываются в файл при serialization.
В serialization классе необходимо использовать
serialVersionUID для обозначения версии класса.
*/