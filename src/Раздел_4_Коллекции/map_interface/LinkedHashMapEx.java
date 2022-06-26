package Раздел_4_Коллекции.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Заур", "Тройников", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        Student st4 = new Student("Игорь", "Сидоров", 2);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        System.out.println("lhm = " + lhm);
        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));
        System.out.println("lhm = " + lhm);
    }

}
/*
LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов или порядке их использования.
Производительность методов немного ниже, чем у методов в HashMap.
Элемент LinkedHashMap помимо той информации, которую содержит элемент HashMap, ещё содержит ссылку на предыдущий
добавленный элемент и последующий добавленный элемент.
Такие методы как remove(), contains() работают здесь точно также.
В конструкторе LinkedHashMap я могу указать 3 параметра, первый это capacity, второй load factor, третий параметр
будет показывать как мы хотим сохранять порядок(Добавления элементов или порядок использования элементов).
Если укажу false, то будет работать точно также. Если в access order поставим true, то порядок будет постоянно меняться в
зависимости от того, какие элементы были использованы в каком порядке.
Метод put и метод get можем считать за использование, то есть когда будем использовать элементы, будут в первую очередь
выводиться неиспользованные элементы в порядке добавления, а затем в конец неиспользованные элементы в порядке использования.
*/