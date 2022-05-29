package Раздел_3_Generics;

public class ParameterizedClass3 {

    public static void main(String[] args) {
        Info3<String> info1 = new Info3<>("привет");
        System.out.println(info1);
        System.out.println("info1 = " + info1.getValue());
        Info3<Integer> info2 = new Info3<>(18);
        System.out.println(info2);
        System.out.println("info2 = " + info2);
    }

}

class Info3<T> {

    private final T value;    // static модификатор не можешь использовать

    public Info3(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}