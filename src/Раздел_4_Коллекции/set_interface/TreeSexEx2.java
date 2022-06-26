package Раздел_4_Коллекции.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSexEx2 {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Заур", 5);
        Student st2 = new Student("Миша", 1);
        Student st3 = new Student("Игорь", 2);
        Student st4 = new Student("Марина", 3);
        Student st5 = new Student("Оля", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());  // Выводит первый элемент
        System.out.println(treeSet.last());   // Выводит последний элемент

        Student st6 = new Student("Oleg", 3);
        // Выводим всех студентов, которые учатся ниже 3 курса, хоть даже нет метода equals, но есть метод compareTo
        System.out.println(treeSet.headSet(st6));

        // Выводим всех студентов, которые учатся на 3 и выше курса, хоть даже нет метода equals, но есть метод compareTo
        System.out.println(treeSet.tailSet(st6));

        // Выведи нам множество студентов, которые учатся в курсе ниже 4 и 2 или выше курса, 2 <= a < 4
        Student st7 = new Student("Oleg", 2);
        Student st8 = new Student("Ivan", 4);
        System.out.println(treeSet.subSet(st7, st8));
        System.out.println(st3.equals(st7));
        System.out.println(st3.hashCode() == st7.hashCode());
    }

}

class Student implements Comparable<Student> {

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

}