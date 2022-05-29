package Раздел_3_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // означает что вместо вопроса здесь может стоять и Integer, и String, и List Object
        // List<?> является super типом для любого листа, вместо вопроса может быть подставлен абсолютно любой класс.

        // Класс Number и ниже
        List<? extends Number> list30 = new ArrayList<Integer>();
        showListInfo(list30);

        // Класс Number и выше
        List<? super Number> list31 = new ArrayList<Object>();
        showListInfo(list31);

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ок");
        list2.add("привет");
        list2.add("пока");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(sum(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(sum(ali));

    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы " + list);
    }

    // Метод, который находим сумму всех элементов, если он Number
    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }

        return sum;
    }
}
/*
Wildcard - название пришло из карточных игр, обозначает какую-ту очень сильную карту, например джокера.
? - символ Wildcard

Если мы напишем так, то мы теперь можем только List Object передавать
    static void showListInfo(List<Object> list){
        System.out.println("Мой лист содержит следующие элементы " + list);
    }

Когда вы используете Wildcard параметры, вы не можете вызывать методы которые изменяют наш объект
Мы можем ставить границы Wildcard-ов, то есть использовать bounded wildcards, это значит ограничивать сверху или снизу
List<?> list = new ArrayList<Integer>();
list.add("hello");                       // НЕЛЬЗЯ ТАК!

 */
/*
Type erasure - стирание типов
Generic появились в 5 Java и нужно было поддерживать backward compatibility - обратную совместимость.
Это означает что код, используемый Generic, должен нормально работать с кодом, который не использует Generic
Для этого и был использован механизм Type erasure
Информацию о Generic знает только компилятор для необходимых ему проверок.
ArrayList<Integer> a1 = new ArrayList<>();
JVM видит вот так: ArrayList al1 = new ArrayList();
int i = (Integer) al1.get(0);
Этот процесс называется стиранием типов, то есть JVM не видит вот этих типов.
Это просто необходимый механизм, чтобы поддерживалась обратная совместимость кода.
 */