package Раздел_6_Lambda_выражения;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Student student3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student student2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student student4 = new Student("Пётр", 'm', 35, 4, 7);
        Student student5 = new Student("Мария", 'f', 22, 3, 9.1);
        Student student1 = new Student("Иван", 'm', 22, 3, 8.3);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student1);
        Predicate<Student> studentPredicate = student -> student.avgGrade > 7.5;
        Predicate<Student> studentPredicate2 = student -> student.sex == 'm';
        for (Student student : studentArrayList) {
            if (studentPredicate.and(studentPredicate2).test(student)) {
                System.out.println(student);
            }
        }
    }

}