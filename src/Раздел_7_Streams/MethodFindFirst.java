package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodFindFirst {

    public static void main(String[] args) {
        Student st2 = new Student("Коля", 'm', 28, 2, 6.4);
        Student st1 = new Student("Ваня", 'm', 22, 3, 8.3);
        Student st3 = new Student("Милена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Патрик", 'm', 35, 4, 7);
        Student st5 = new Student("Мадина", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student first = students.stream()
                .peek(element ->
                        element.setName(element.getName().toUpperCase()))
                .filter(element -> element.getSex() == 'f')
                .min(Comparator.comparingInt(Student::getAge)).orElse(null);
        System.out.println(first);
    }

}
/*
Метод findFirst - терминальный метод, этот метод возвращает первый элемент нашего стрима, возвращает Optional
*/