package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodsMinMax {
    public static void main(String[] args) {
        Student st2 = new Student("Андрей", 'm', 28, 2, 6.4);
        Student st1 = new Student("Женя", 'm', 22, 3, 8.3);
        Student st3 = new Student("Алиса", 'f', 19, 1, 8.9);
        Student st4 = new Student("Артур", 'm', 35, 4, 7);
        Student st5 = new Student("Евелина", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student min2 = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(min2);
        Student max = students.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(max);
    }
}
/*
Min - терминальный метод, возвращает Optional, внутри него описываем компаратор
Max - терминальный метод
*/