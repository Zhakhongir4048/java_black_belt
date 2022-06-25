package Раздел_4_Коллекции;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Заур");
        strings.add("Иван");
        strings.add("Мария");
        strings.add("Коля");
        strings.add("Елена");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("Заур");
        strings2.add("Иван");
        strings2.add("Мария");
        strings2.add("Коля");
        strings2.add("Елена");
        Iterator<String> iterator = strings.iterator();
        Iterator<String> iterator2 = strings2.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            System.out.println(count++ + " " + iterator.next());
        }
        while (iterator2.hasNext()) {
            // Обязательно пишем, а то выбросится IllegalStateException
            iterator2.next();
            iterator2.remove();
        }
        System.out.println("strings2 = " + strings2);
    }

}
/*
Iterator - это повторитель. С помощью него мы сможем пробежаться по элементам нашего листа.
Iterator от for each отличается тем, что в итераторе мы можем удалять элементы(т) из коллекции.
*/