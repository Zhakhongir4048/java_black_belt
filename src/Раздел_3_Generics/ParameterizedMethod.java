package Раздел_3_Generics;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        Integer secondElement1 = GenMethod.getSecondElement(al1);
        System.out.println("secondElement = " + secondElement1);
    }

}

class GenMethod {

    // Т - Вторая буква, T return type нашего метода. <T> - использование Generics, без него никак!
    // T extends Number писать нельзя в параметре метода
    public static <T extends Number> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }

}
/*
ParameterizedMethod - это методы, у которых в параметре листа есть generic.
Generic методы очень полезны для написания методов которые нужны и будут использоваться очень широким range типов данных,
но при этом функциональность этого метода должна быть для всех этих типов данных одинаковая.
В parameterized классе мы можем создавать parameterized методы
Так писать нельзя
List<X> list1 = new ArrayList<Y>();
Потому, что совокупность ArrayList<Y>() не является подтипом List<X>
Так тоже нельзя писать
List<Number> list = new ArrayList<Integer>().
Generics нам нужен, чтобы решать проблемы на уровне компиляции.
Если нам нужно, чтобы Т был бы каким-то числом, мы можем написать вот так
Т extends Number.
Для JVM не существует понятие generics и информация о generics стирается.
Для JVM после компиляции этой информации (то есть про поля) тоже нет.
Вместо Т пишется Object.
А если вы используете Т extends Number, то смысла использовать вместо Т Object уже нет.
Так надо писать, в параметре метода не пишем T extends Number
class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
Можно наследоваться Т только от одного класса, но может имплементировать несколько интерфейсов.
Сначала мы extends пишем, затем только реализуем интерфейсы с помощью &
class Info <T extends Number & I1 & I2>{

}
*/