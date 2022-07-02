package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodChaining2 {

    public static void main(String[] args) {
        Student st1 = new Student("Тимур", 'm', 22, 3, 8.3);
        Student st2 = new Student("Артём", 'm', 28, 2, 6.4);
        Student st3 = new Student("Маша", 'f', 19, 1, 8.9);
        Student st4 = new Student("Артур", 'm', 35, 4, 7);
        Student st5 = new Student("Саша", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream()
                .peek(element ->
                        element.setName(element.getName().toUpperCase()))
                .filter(element -> element.getSex() == 'f')
                .sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);
    }

}
