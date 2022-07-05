package Раздел_11_Другие_важные_темы.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {


}
/*
Аннотации - это специальные комментарии/метки/метаданные, которые нужны для передачи определённой информации.
@Target показывает область кода, к которой Аннотация может быть применима. Самые распространённые области кода:
TYPE - class, interface, enum;
FIELD - поле класса;
METHOD - метод класса;
PARAMETER - параметры метода или конструктора
@Retention описывает жизненный цикл Аннотации
SOURCE - Аннотация видна в source коде, обрабатывается компилятором и уже в byte коде не видна;
CLASS - Аннотация видна в byte code, обрабатывается JVM во время выполнения программы;
RUNTIME - Аннотация видна во время выполнения программы
*/