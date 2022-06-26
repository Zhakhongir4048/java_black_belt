package Раздел_4_Коллекции.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs);
        lhs.remove(8);
        System.out.println(lhs);
        System.out.println(lhs.contains(8));
    }
}
/*
LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов.
Производительность методов немного ниже, чем у методов HashSet.
В основе LinkedHashSet лежит HashMap. У элементов данного HashMap: ключи - это элементы LinkedHashSet,
значения - это константа-заглушка.
В LinkedHashMap мы можем запоминать последовательность элементов в зависимости от их последнего использования, в
LinkedHashSet такой возможности нет.
*/