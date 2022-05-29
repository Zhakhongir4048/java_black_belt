package Раздел_2_Интерфейсы_Comparable_и_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        List.add("Дима");
        List.add("Иван");
        List.add("Мария");
        System.out.println("Перед сортировкой");
        System.out.println(List);
        Collections.sort(List);
        System.out.println("После сортировки");
        System.out.println(List);
    }
}
/*
Comparable и Comparator - интерфейсы эти нужны для сравнения и сортировки объектов в какой-то коллекции или массиве
Сортировка String произойдёт по естественному порядку natural order
В Integer тоже natural order.
Для того чтобы применить метод сравнения этих объектов, мы можем использовать интерфейс Comparable(способен быть сравнимым)
Мы сравниваем текущий объект который мы создадим с объектом в параметре метода compareTo.
Придерживайтесь Natural порядка.
Integer и String implements Comparable, в них этот метод compareTo прекрасно описан
Если мы хотим делать Ordering в зависимости от имени наших работников.
Интерфейс Comparable используется для сравнения объектов, используя естественный порядок.
Нам не обойтись без Comparator-а, у нас есть класс String, он implements класс Comparable
Если вдруг вы захотите отсортировать строки наоборот, тогда вы должны написать свой компаратор и при sorting-е, использовать
этот компаратор как второй параметр.
Если вы хотите String отсортировать по количеству букв, слов, то вы должны использовать Comparator
Интерфейс Comparator используется для сравнения объектов, используя НЕ естественный порядок
 */