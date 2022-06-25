package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods8 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(222);
        integers.add(333);
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println("list1 = " + list1);
        List<Integer> copy = List.copyOf(integers);
        System.out.println("copy = " + copy);
    }

}
/*
List.of(E ...elements) -> List<E>         \
                                   Коллекции на выходе они неизменяемые, их невозможно изменить. Не могут содержать NULL
List.copyOf(Collection  <E> c) -> List<E> /
*/