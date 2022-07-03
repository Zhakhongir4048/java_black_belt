package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodMapToInt {

    public static void main(String[] args) {
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        /*
        Когда мы хотим значение из Stream записать в List<Integer> мы обязаны
        использовать метод boxed()
        Метод boxed() просто конвертирует значение int в значение Integer
        У нас курсы это int, а нам нужно конвертировать в Integer.
        У IntStream есть несколько методов, которые работают с числами.
        Это методы sum, average, min, max.
         */
        // 1 вариант
        List<Integer> courses = students.stream()
                .mapToInt(Student::getCourse)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        // 2 вариант
        int[] courses2 = students.stream()
                .mapToInt(Student::getCourse)
                .toArray();
        System.out.println(Arrays.toString(courses2));

        List<Double> avgGrades = students.stream()
                .mapToDouble(Student::getAvgGrade)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(avgGrades);

        // Просуммирует все курсы наших студентов
        int sum = students.stream().mapToInt(Student::getCourse).sum();
        System.out.println(sum);

        // Находим среднее арифметическое для курсов студентов
        double average = students.stream().mapToInt(Student::getCourse).average().orElse(0.0);
        System.out.println(average);

        // Минимальный курс
        int min = students.stream().mapToInt(Student::getCourse).min().getAsInt();
        System.out.println(min);

        // Максимальный курс
        int max = students.stream().mapToInt(Student::getCourse).max().getAsInt();
        System.out.println(max);
    }

}
/*
Метод mapToInt - Intermediate метод, данный метод возвращает не просто стрим после себя,
а intStream, то есть Stream который содержит значение int.
У mapToInt есть несколько методов, которые работают с числами.
Это методы sum, average, min, max.
*/