package Раздел_9_Работа_с_файлами_IO_и_NIO.work_with_binary_file.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionUID = 2;

    String name;
    String surname;
    String department;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

}