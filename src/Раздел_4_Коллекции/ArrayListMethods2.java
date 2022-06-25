package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
        studentArrayList.remove(st6);
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        int indexOf = studentArrayList.indexOf(st6);
        System.out.println("indexOf = " + indexOf);
        int indexOf2 = studentArrayList.indexOf(st4);
        System.out.println("indexOf2 = " + indexOf2);
    }

}

class Student {

    private final String name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sex != student.sex) return false;
        if (age != student.age) return false;
        if (course != student.course) return false;
        if (Double.compare(student.avgGrade, avgGrade) != 0) return false;
        return Objects.equals(name, student.name);

    }

}