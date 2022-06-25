package Раздел_4_Коллекции;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {

    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder stringBuilder4 = new StringBuilder("D");
        StringBuilder[] stringBuildersArrays = {stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4};
        // List будет той же длины, что и массив array
        List<StringBuilder> list = Arrays.asList(stringBuildersArrays);
        System.out.println("list = " + list);
        // Если мы изменим элемент массива array, то изменения отразятся в List
        // Мы изменили нулевой элемент нашего массива
        stringBuildersArrays[0].append("!!!");
        System.out.println("list = " + list);
        // Мы не можем изменять длину листа! вылетит ошибка UnsupportedOperationException
        // list, который был получен с помощью метода asList(), очень тесно связан с массивом array
        list.add(new StringBuilder("Dzhoha"));
    }

}