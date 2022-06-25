package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Коля");
        arrayList1.add("Елена");
        System.out.println("arrayList1 = " + arrayList1);
        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("myList = " + myList);
        myList.add("Фёдор");
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("myList = " + myList);
        // Не делай так!
        arrayList1.add("Света");
        System.out.println("arrayList1 = " + arrayList1);
        // ConcurrentModificationException
        System.out.println("myList = " + myList);
    }

}
/*
subList(int fromIndex, int toIndex) -> List<E> - создаёт из имеющегося ArrayList его отрывок, возвращает List.
ConcurrentModificationException выкидывается потому, что все структурные модификации в данном случае должны
быть сделаны с помощью нашего view, если мы делаем структуру модификации над нашим ArrayList напрямую и потом
пытаемся использовать наше представление sublist, мы не получим нужного результата. Будет выскакивать
ConcurrentModificationException.
*/