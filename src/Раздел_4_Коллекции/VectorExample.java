package Раздел_4_Коллекции;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Заур");
        vector.add("Миша");
        vector.add("Олег");
        vector.add("Катя");
        System.out.println("vector = " + vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println("vector = " + vector);
    }

}
/*
Vector - устаревший synchronized класс. В своей основе содержит массив элементов Object.
Не рекомендован для использования.
ArrayList и LinkedList не синхронизированы, то есть они по умолчанию не предназначены для работы с
несколькими потоками.
Методы Vector работают намного медленнее, чем у ArrayList и LinkedList
*/