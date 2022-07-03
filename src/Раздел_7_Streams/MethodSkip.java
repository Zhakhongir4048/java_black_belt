package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;

public class MethodSkip {

    public static void main(String[] args) {
        Student st1 = new Student("John", 'm', 22, 3, 8.3);
        Student st2 = new Student("James", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
    }

}
/*
Метод skip - Intermediate метод, он ограничивает количество элементов в нашем Stream.
Но если limit оставлял первые n элементов из нашего стрима, то метод skip будет пропускать первые n элементов
нашего стрима.
*/