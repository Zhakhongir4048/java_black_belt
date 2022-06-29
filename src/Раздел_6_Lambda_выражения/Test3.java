package Раздел_6_Lambda_выражения;

public class Test3 {

    public static void main(String[] args) {
        int i = 10;
        def(() -> {
            System.out.println(i);
            return 4 + i;
        });
    }

    static void def(I2 i) {
        System.out.println(i.abc());
    }

}

interface I2 {

    int abc();

}