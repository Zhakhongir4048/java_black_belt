package Раздел_6_Lambda_выражения;

public class Test3 {

    public static void main(String[] args) {
        def(() -> 4);
    }

    static void def(I2 i) {
        System.out.println(i.abc());
    }

}

interface I2 {

    int abc();

}