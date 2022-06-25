package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        // 1 вариант создания
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        // 2 вариант создания
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Джон");
        arrayList2.add("Том");
        // 3 вариант создания
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Томас");
        // 4 вариант создания, arrayList4 новый объект, он не ссылается на arrayList1
        List<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList2 = " + arrayList2);
        System.out.println("arrayList3 = " + arrayList3);
        System.out.println("arrayList4 = " + arrayList4);
        System.out.println(arrayList1 == arrayList4);       // Разные ссылки
    }

}
/*
private static final int DEFAULT_CAPACITY = 10;
ArrayList - это массив, который может изменять свою длину.
В основе ArrayList лежит динамический массив Object.
Есть несколько способов создать ArrayList.
ArrayList<DataType> list1 = new ArrayList<DataType>();
ArrayList<DataType> list2 = new ArrayList<>();
ArrayList<DataType> list3 = new ArrayList<>(30);
ArrayList<DataType> list3 = new ArrayList<>(list3);
Когда мы создаём ArrayList, за кулисами создаётся массив с размером 10.
На данный момент размер ArrayList 0, так как мы не добавили ни один элемент.
Capacity - вместимость, дефолтное 10.
Size и Capacity это два разных понятий
Всегда используй generic.
*/