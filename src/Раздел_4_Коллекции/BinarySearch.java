package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        // Сначала сортируем
        Collections.sort(arrayList);
        int findIndex = Collections.binarySearch(arrayList, 12);
        System.out.println("findIndex = " + findIndex);
        // Переворачиваем
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        // Перемешиваем
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        System.out.println("----------------------------------");
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);
    }

}
/*
Collections - методы его sort, binarySearch
Надо отсортировать массив наш или коллекцию сначала.
Делиться массив пополам и идёт сравнение со средним элементов и так далее, если искомый элемент больше,
то продолжаем поиск в правой части, а левую часть отбрасываем.
*/