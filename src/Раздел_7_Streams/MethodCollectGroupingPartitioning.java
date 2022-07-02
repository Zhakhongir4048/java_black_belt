package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodCollectGroupingPartitioning {
    public static void main(String[] args) {
        Student st2 = new Student("Денис", 'm', 28, 2, 6.4);
        Student st1 = new Student("Влад", 'm', 22, 3, 8.3);
        Student st3 = new Student("Женя", 'f', 19, 1, 8.9);
        Student st4 = new Student("Паша", 'm', 35, 4, 7);
        Student st5 = new Student("Маша", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

       /*
       Давайте изменим имена наших студентов на заглавные буквы и отсортируем по курсам.
       То есть для каждого курса у нас будет свой list.
       GroupingBy - по какому атрибуту моего студента, я буду производить группировку,
       collect вернёт Map, который содержит Integer как ключ, и как значение List студентов.
       Ключ это номер курса, а значение лист студентов.
       */
        Map<Integer, List<Student>> studentMap = students.stream()
                .peek(el -> el.setName(el.getName().toUpperCase()))
                .collect(Collectors.groupingBy(Student::getCourse));

        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }

        /*
        Predicate - то тело лямбда выражения должно быть boolean, ключом Map - Boolean будет, т.к
        partitioningBy возвращает Map<Boolean, List<T>>>
         */
        Map<Boolean, List<Student>> map =
                students.stream()
                        .collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }

    }
}
/*
Метод collect - terminal метод, который преобразует поток в лист или в другую коллекцию.
Когда мы использовали этот метод, мы использовали Collectors класс, у которого есть 2 метода
GroupingBy - по какому атрибуту моего студента, я буду производить группировку.
PartitioningBy - разделение по, ключом будет Boolean, так как в параметре принимает Predicate.
*/