package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFilter {

    public static void main(String[] args) {
        Student st1 = new Student("Ваня", 'm', 22, 3, 8.3);
        Student st2 = new Student("Коля", 'm', 28, 2, 6.4);
        Student st3 = new Student("Лена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петя", 'm', 35, 4, 7);
        Student st5 = new Student("Маша", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        /*
        Давайте отфильтруем студентов и оставим только тех, возраст которых больше 22 и средняя оценка меньше 7.2
        filter в параметре принимает Predicate, то есть написать как будет выглядеть наш метод
        */
        List<Student> studentList =
                students.stream().filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
                        .collect(Collectors.toList());
        System.out.println(studentList);
        System.out.println("------------");
        System.out.println(students.get(0).getSex() + students.get(0).getAge() +
                students.get(0).getAvgGrade() + students.get(0).getCourse());
    }

}

class Student {

    private String name;
    private final char sex;
    private final int age;
    private final int course;
    private final double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

}
/*
Методы Stream не меняют саму коллекцию или массив, от которой был создан stream
Метод filter - фильтрует данные из определённого набора. Например, коллекция List.
Мы фильтруем по каким-то определённым критериям.
 */