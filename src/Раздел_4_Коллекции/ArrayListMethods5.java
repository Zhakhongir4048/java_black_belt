package Раздел_4_Коллекции;

import java.util.ArrayList;

public class ArrayListMethods5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Коля");
        System.out.println("arrayList1 = " + arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Иван");
        arrayList2.add("Мария");
        arrayList2.add("Игорь");
        System.out.println("arrayList2 = " + arrayList2);
        // Удалит из первого ArrayList1 элементы которых совпадают с элементами во втором ArrayList2.
        arrayList1.removeAll(arrayList2);
        System.out.println("arrayList1 = " + arrayList1);
    }

}
/*
removeAll(Collection<?> c) -> boolean -  удалит из первого ArrayList1 элементы которых совпадают с элементами во втором ArrayList2.
retainAll(Collection<?> c) -> boolean - оставит из первого ArrayList1 элементы которых  совпадают с элементами во втором ArrayList2.
containsAll(Collection<?> c) -> boolean - проверяет, содержит ли наш ArrayList1 все элементы ArrayList2 из этого параметра.
То есть первый ArrayList1 содержит ли все элементы, которые есть в ArrayList2?
*/