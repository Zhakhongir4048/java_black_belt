package Раздел_4_Коллекции.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Заур");
        map1.put(3568, "Иван");
        map1.put(6789, "Мария");
        map1.put(1234, "Николай");
        map1.put(null, "Дима");
        map1.put(84231, null);
        map1.putIfAbsent(1000, "Олег");
        System.out.println("map1 = " + map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.containsValue("Мария"));
        System.out.println(map1.containsKey(100));
        System.out.println(map1.remove(1234));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }

}
/*
Элементами HashMap являются пары ключ/значение.
HashMap не запоминает порядок добавления элементов.
Его методы работают очень быстро.
Ключи элементов должны быть уникальными. Ключ может быть null.
Значение элементов могут повторяться. Значения могут быть null,
put - добавляет элемент в Map.
putIfAbsent - означает, добавь элемент в нашу коллекцию HashMap, если такого элемента нет,
get - указываем ключ, чтобы вывести значение,
remove - удаляет.
containsValue - будет возвращать true, если в нашем HashMap содержится значение.
containsKey - будет возвращать true, если в нашем HashMap содержится ключ.
keySet - возвращает множество всех ключей, которыми мы пользуемся, они есть в нашем HashMap
values - возвращает множество значений HashMap
entrySet
*/