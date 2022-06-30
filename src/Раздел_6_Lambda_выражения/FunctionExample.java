package Раздел_6_Lambda_выражения;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Student, Double> function = student -> student.avgGrade;
        Student student1 = new Student("Джон", 'm', 22, 3, 8.3);
        Student student2 = new Student("Ислам", 'm', 28, 2, 6.4);
        Student student3 = new Student("Джавид", 'm', 19, 1, 8.9);
        Student student5 = new Student("Саид", 'm', 22, 3, 9.1);
        Student student4 = new Student("Петя", 'm', 35, 4, 7);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(avgOfSomething(students, function));
    }

    private static double avgOfSomething(List<Student> studentList, Function<Student, Double> doubleFunction) {
        double result = 0;
        for (Student student : studentList) {
            result += doubleFunction.apply(student);
        }
        result = result / studentList.size();
        return result;
    }

}