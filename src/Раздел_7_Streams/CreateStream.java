package Раздел_7_Streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        Student st1 = new Student("Вася", 'm', 22, 3, 8.3);
        Student st2 = new Student("Дима", 'm', 28, 2, 6.4);
        Student st3 = new Student("Лена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петя", 'm', 35, 4, 7);
        Student st5 = new Student("Маша", 'f', 23, 3, 7.4);
        // Создаём готовый Stream с нуля
        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        List<Student> students = myStream.filter(student ->
                student.getAge() > 22 && student.getAvgGrade() < 7.2).collect(Collectors.toList());
        System.out.println(students);
    }

}