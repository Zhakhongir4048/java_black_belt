package Раздел_4_Коллекции.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Заур");
        set.add("Олег");
        set.add("Марина");
        set.add("Игорь");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        set.remove("Заур");
        System.out.println("set = " + set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Миша"));
    }

}
/*
Set - коллекция, хранящая уникальные элементы.
Методы данной коллекции очень быстры.
В основе любого Set сидит урезанная версия Map, в основе HashSet находиться объект HashMap, который и хранит
в качестве ключей значение HashSet.
Когда мы создаём HashSet, в основе его создаётся HashMap
Когда мы добавляем в качестве значение Zaur, Zaur в HashMap будет соответствовать ключу, для Set никакие значения не нужны.
То есть элемент Set-а помещается в ключ HashMap, а значение Map не нужно!
Как заглушку HashMap будет хранить какую-ту константу и на неё HashSet не обращает никакого внимания.
Если мы добавим в HashSet имя Oleg, в HashMap добавится Oleg как ключ, и опять та же самая константа будет помещена
в качестве значения нашего HashMap.
HashSet этими заглушками вообще не пользуется.
Java заполняет значение HashMap какими-то константами.
В основе HashSet лежит HashMap, элементы HashMap представляют собой ключ, который равен элементу HashSet,
а значение у всех элементов будут одинаковыми и они вообще не используются!
HashSet не запоминает порядок добавления элементов. В основе HashSet лежит HashMap. У элементов данного
HashMap: ключи - это элементы HashSet, значения - это константа-заглушка.
Также HashSet может содержать значение null.
Set и его реализации not synchronized.
Когда мы вызываем метод add, то он внутри вызывает метод put, который принадлежит HashMap.
Если мы работаем с Set и нам нужно хранить элементы Student, то обязательно мы должны переопределить методы hashcode
и equals
У Set нет метода get()
*/