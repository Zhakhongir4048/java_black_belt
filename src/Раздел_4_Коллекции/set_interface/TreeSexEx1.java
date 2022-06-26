package Раздел_4_Коллекции.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSexEx1 {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));
    }

}
/*
TreeSet хранит элементы в отсортированном по возрастанию порядке.
В основе TreeSet лежит TreeMap. У элементов данного TreeMap: ключи - это элементы TreeSet,
значения - это константа-заглушка.
В основе лежит красно-чёрное дерево.
Всё так же как у TreeMap, так как он лежит в основе TreeSet.
TreeMap null не хранил, соответственно и TreeSet не хранит null.
Деревья работают, используя compareTo, поэтому обязательно должны реализовывать Comparable, либо мы можем при
создании TreeSet в конструкторе указать Comparator.
subSet позволяет нам, из нашего TreeSet получить множество, элементы которого находятся между какими-то двумя показателями,
equals всегда надо делать желательно.
a.equals(b) -> true, то a.compareTo(b) -> 0
*/