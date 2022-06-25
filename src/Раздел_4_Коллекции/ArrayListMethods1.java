package Раздел_4_Коллекции;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add(1, "Миша");
        System.out.println("arrayList1 = " + arrayList1);
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        arrayList1.set(1, "Даша");
        System.out.println(arrayList1.get(1));
        arrayList1.remove(0);
        System.out.println("arrayList1 = " + arrayList1);
    }

}
/*
add(DataType element) -> boolean
add(int index, DataType element) -> boolean
Всего элементов 4, если я захочу добавить Мишу на 6 позицию , то выбросится IndexOutOfBoundsException
get(int index) -> DataType
set(int index, DataType element) -> DataType
remove(Object element) -> boolean
remove(int index) -> DataType
Если мы удалим тот индекс, которого нет в ArrayList, то выбросится IndexOutOfBoundsException
Когда мы удаляем объект, то сравнение происходит через equals
Надо переопределить метод equals!
*/