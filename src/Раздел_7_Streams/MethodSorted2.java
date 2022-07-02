package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodSorted2 {

    public static void main(String[] args) {
        Student st1 = new Student("Миша", 'm', 22, 3, 8.3);
        Student st2 = new Student("Никита", 'm', 28, 2, 6.4);
        Student st3 = new Student("Даша", 'f', 19, 1, 8.9);
        Student st4 = new Student("Паша", 'm', 35, 4, 7);
        Student st5 = new Student("Наташа", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        // Давайте отсортируем наш List студентов, вставляем в наш параметр sorted наш Comparator
        students = students.stream().sorted((x, y) ->
                        x.getName().compareTo(y.getName())).
                collect(Collectors.toList());
        System.out.println(students);

        // Или можем вот так отсортировать
        students = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(students);

    }

}