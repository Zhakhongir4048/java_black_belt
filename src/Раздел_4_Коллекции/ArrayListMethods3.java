package Раздел_4_Коллекции;

import java.util.ArrayList;

public class ArrayListMethods3 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        System.out.println("arrayList1 = " + arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        System.out.println("arrayList2 = " + arrayList2);
        arrayList1.addAll(arrayList2);
        System.out.println("arrayList1 = " + arrayList1);
        arrayList2.clear();
        System.out.println("arrayList2 = " + arrayList2);
        int index = arrayList1.indexOf("Мария");
        System.out.println(index);
    }

}
/*
Все элементы другого ArrayList будут добавлены в наш ArrayList
addAll(ArrayList al) -> boolean               // В конец
addAll(int index, ArrayList al) -> boolean    // Начиная с определённой позиции
clear() очищает наш ArrayList
indexOf(Object element) -> int                // Возвращает индекс, в параметр поставляем элемент. Работает equals как в remove
Метод equals переопределён в String
lastIndexOf(Object element) -> int            // Поиск идёт с конца, позиция первого совпадения выведется на экран
size() -> int
isEmpty() -> boolean
contains(Object element) -> boolean           // Используется метод equals
toString() -> String
*/