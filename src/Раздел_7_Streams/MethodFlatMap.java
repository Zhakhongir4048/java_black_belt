package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;

public class MethodFlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Влад", 'm', 22, 3, 8.3);
        Student st2 = new Student("Денис", 'm', 28, 2, 6.4);
        Student st3 = new Student("Женя", 'f', 19, 1, 8.9);
        Student st4 = new Student("Паша", 'm', 35, 4, 7);
        Student st5 = new Student("Маша", 'f', 23, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        /*
        Метод flatMap мы используем тогда, когда нам надо поработать напрямую не с самими элементами
        нашей коллекции, а с элементами элементов нашей коллекции!
        Например, в данном случае, мы хотим вывести имена всех студентов из всех факультетов.
        Сначала мы имеем факультет, с помощью этого факультета получаем List студентов на этом
        факультете, и уже на этом листе мы вызываем stream().
        И уже потом с помощью метода forEach выводим имена всех студентов.
        С помощью метода flatMap и вызова метода stream() на каждом элементе листа Faculty.
        Мы для каждой нашей коллекции создаём отдельный Stream, и все эти Stream в итоге образуют
        один большой стрим из всех элементов листа Faculty
         */
        facultyList.stream().flatMap(element -> element.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}

class Faculty {

    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }

}
/*
Метод flatMap() похож на метод map(), но работает немного по другому
Он intermediate метод
*/