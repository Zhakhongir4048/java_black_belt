package Раздел_6_Lambda_выражения;

public class Test2 {

    public static void main(String[] args) {
        def(String::length);
    }

    static void def(I i) {
        System.out.println(i.abc("Привет!"));
    }

}

interface I {

    int abc(String s);

}