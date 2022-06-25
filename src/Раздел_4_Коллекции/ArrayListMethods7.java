package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods7 {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Заур");
        strings.add("Иван");
        strings.add("Мария");
        strings.add("Коля");
        strings.add("Елена");
        System.out.println("strings = " + strings);
        Object[] array = strings.toArray();
        System.out.println("array = " + Arrays.toString(array));
        String[] array2 = strings.toArray(new String[0]);
        for (String s : array2) {
            System.out.println(s);
        }
    }

}
/*
toArray() -> Object [] из нашего ArrayList получаем массив типа Object.
toArray(T [] a) -> T []
*/