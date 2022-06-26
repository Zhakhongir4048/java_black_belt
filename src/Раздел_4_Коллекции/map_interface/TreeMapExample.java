package Раздел_4_Коллекции.map_interface;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Заур", "Тройников", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        Student st4 = new Student("Игорь", "Сидоров", 2);
        Student st5 = new Student("Василий", "Смирнов", 1);
        Student st6 = new Student("Саша", "Капустина", 3);
        Student st7 = new Student("Елена", "Сидорова", 4);
        Student st8 = new Student("Елена", "Сидорова", 4);
        // Уникальность ключей должна поддерживаться
        treeMap.put(8.2, st6);
        treeMap.put(5.8, st1);
        treeMap.put(7.2, st3);
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st7);
        treeMap.put(7.9, st5);
        treeMap.put(7.5, st4);
        treeMap.put(3.2, st8);
        System.out.println("treeMap = " + treeMap);
        System.out.println(treeMap.get(6.4));
        treeMap.remove(5.8);
        System.out.println("treeMap = " + treeMap);
        // Разворачиваем TreeMap
        System.out.println("treeMap.descendingMap() = " + treeMap.descendingMap());
        // От 7.3 выведи всех студентов
        System.out.println(treeMap.tailMap(7.3));
        // До 7.3 выведи всех студентов
        System.out.println(treeMap.headMap(7.3));
        // Выводим последнего студента
        System.out.println(treeMap.lastEntry());
        // Выводим первого студента
        System.out.println(treeMap.firstEntry());
    }

}