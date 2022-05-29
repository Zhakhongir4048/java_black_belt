package Раздел_3_Generics;

public class ParameterizedClass2 {

    public static void main(String[] args) {
        Info2<Bus> info = new Info2<>(new Bus());
        System.out.println("info = " + info);
        Bus value = info.getValue();
        System.out.println("value = " + value);
    }

}

class Info2<T extends Bus & i1 & i2> {

    // Тип Т в дальнейшем может быть заменён на множество типов. Не может быть статичным
    private final T value;

    public Info2(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {            // Будет возвращать T
        return value;
    }

}

class Bus implements i1, i2 {
}

interface i1 {

}

interface i2 {

}
/*
<?> - любой класс.
<? extends X> - класс Х или любой его subclass
<? super Y> - класс Y или любой его superclass
1)Type safe - тип безопасность, одна из двух главнейших, важнейших целей создания generics
2)Reusable code - generic позволяют нам не создавать похожие классы, похожие методы, похожий код, а использовать generic,
чтобы одно и тоже не писать. Если мы не могли бы указывать какой-то класс, элементы которого будет содержать List,
получалось бы для каждого типа должен был существовать свой List.
<> символ Diamond
Всегда символ Diamond надо ставить
Raw type - Сырые типы — это типы без указания "уточнения" в фигурных скобках (angle brackets)
*/