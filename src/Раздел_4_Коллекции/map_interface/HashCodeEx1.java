package Раздел_4_Коллекции.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {

    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Заур", "Тройников", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        Student st4 = new Student("Заур", "Тройников", 3);
        boolean result = map.containsKey(st4);
        System.out.println("map = " + map);
        System.out.println("result = " + result);
    }

}

// Лучше в качестве ключа использовать Immutable класс
final class Student implements Comparable<Student> {

    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
/*
Если вы переопределили equals, то переопределите и hashcode.
Некоторые коллекции используют хеширование при поиске и сравнении.
HashMap и HashSet относятся к таким коллекциям.
Без хэш-кода не обойтись, если мы работаем с HashMap и HashSet.
Хеширование Java - это преобразование с помощью метода hashcode любого объекта в int.
Сравнение в HashMap сначала идёт по hashcode, потом по equals.
У String и Integer hashcode отлично переопределён.
Когда у разных объектов возвращается один hashcode, это называется коллизией.
И чем меньше коллизий в нашем коде, тем лучше.
Обычно в hashcode какие-то значения умножаются на простые числа, чтобы коллизий было меньше
Результат нескольких выполнений метода hashcode для одного и того же объекта должен быть одинаковым.
Если согласно методу equals, два объекта равны, то и hashcode данных объектов обязательно должен
быть одинаковым.
Если, согласно методу equals, два объекта НЕ равны, то hashcode данных объектов необязательно
должен быть разным.
Объекты в HashMap не только по hashcode сравниваются. Они сначала сравниваются по hashcode, а потом уже по equals;
hashcode работает намного быстрее чем, equals.
Для 1000 объектов студентов мы можем создать разные hashcode, но если их будет огромное количество, то hashcode будут повторяться,
потому, что hashcode возвращает int, у int есть предел, а объектов студентов мы можем создать бесконечное количество
Ситуация, когда результат метода hashcode для разных объектов одинаков, называется коллизией. Чем её меньше тем лучше.
Если мы не переопределяем hashcode, всё равно этот метод у нас есть, дефолтная реализация hashcode в Object такова, что
там в алгоритме используется адрес нашего объекта, то есть у каждого ново созданного объекта будет уникальный hashcode, то есть,
если объекты равны по equals, то hashcode у них будет разным.
entrySet возвращает множество Entry - это интерфейс внутренний для Map, который реализуется нашим классом внутренним для
Map, Node, он содержит ключ, значение, хеш, ссылку на следующий элемент.
*/