package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer1;

import java.io.Serializable;

public class Car implements Serializable {

    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}