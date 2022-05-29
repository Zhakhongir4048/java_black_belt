package Раздел_3_Generics;

public class ParameterizedClass {

    public static void main(String[] args) {
        Info<Integer> info = new Info<>(44);
        System.out.println("info = " + info);
        System.out.println("value = " + info.getValue());
    }

}

class Info<T> {

    // Тип Т в дальнейшем может быть заменён на множество типов. Не может быть статичным
    private final T value;

    public Info(T value) {
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
/*
Generic появились в Java 5
public void abc(Info<String> info) {
   String value = info.getValue();
}

public void abc(Info<Integer> info) {
   Integer value = info.getValue();
}

Так нельзя писать в одном классе, так как происходит стирание типов для поддержания backward compatibility

class Parent {
    public void abc(Info<String> info) {
        String value = info.getValue();
    }
}

class Child extends Parent {
    public void abc(Info<Integer> info) {
        Integer value = info.getValue();
    }
}
*/