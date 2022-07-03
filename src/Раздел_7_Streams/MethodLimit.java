package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;

public class MethodLimit {

    public static void main(String[] args) {
        Student st2 = new Student("Глеб", 'm', 28, 2, 6.4);
        Student st1 = new Student("Гаджи", 'm', 22, 3, 8.3);
        Student st3 = new Student("Алина", 'f', 19, 1, 8.9);
        Student st4 = new Student("Рустам", 'm', 35, 4, 7);
        Student st5 = new Student("Ангелина", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream()
                .filter(student -> student.getAge() > 20)
                .limit(2)
                .forEach(System.out::println);
    }

}
/*
Метод limit - возвращает стрим, intermediate метод, ограничивает количество элементов в нашем Stream,
внутри передаём число типа long
*/