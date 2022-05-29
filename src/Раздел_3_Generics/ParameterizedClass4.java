package Раздел_3_Generics;

public class ParameterizedClass4 {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("привет", 20);
        System.out.println("Значение пары: value1 = " + pair1.getFirstValue() + ", " +
                "value2 = " + pair1.getSecondValue());
        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println("Значение пары: value1 = " + pair2.getFirstValue() + ", " +
                "value2 = " + pair2.getSecondValue());
        OtherPair<String> otherPair = new OtherPair<>("ок", "пока");
        System.out.println("Значение пары: value1 = " + otherPair.getFirstValue() + ", " +
                "value2 = " + otherPair.getSecondValue());
        System.out.println("abc = " + otherPair.abc("salam"));
    }

}

class Pair<V1, V2> {

    private final V2 value2;
    private final V1 value1;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

}

class OtherPair<V> {

    private final V value1;
    private final V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V abc(V val) {
        return val;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }

}
/*
Я хочу создать класс Info в котором будет содержаться какое-то одно значение, но я пока не знаю какого типа будет это значение
Типы этого значения могут быть разные.
Я хочу выводить это значение в красивых скобках.
Используется часто Т.
Используется часто Е если вы работаете с элементами.
Используется буква K если вы работаете с ключами.
Используется буква V если вы работаете с value.
К и V часто используется у map.
Буква T называется type placeholder(заполнитель типа, хранитель типа)
То есть он временно исполняет роль какого-то типа данных, который потом будет заменён на действительно существующий.*/