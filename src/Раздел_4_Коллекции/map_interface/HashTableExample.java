package Раздел_4_Коллекции.map_interface;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Заур", "Тройников", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        Student st4 = new Student("Игорь", "Сидоров", 2);
        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
        // NullPointerException
        ht.put(null, st4);
        // NullPointerException
        ht.put(null, null);
        System.out.println("ht = " + ht);
    }
}
/*
HashTable - устаревший класс, который работает по тем же принципам, что и HashMap.
В отличие от HashMap является synchronized. По этой причине его методы далеко не такие быстрые.
В HashTable ни ключ, ни значение не могут быть null.
Даже если нужна поддержка multithreading HashTable лучше не использовать. Следует использовать
ConcurrentHashMap
HashTable устроен так же как и HashMap, в его основе лежит тоже массив.
*/