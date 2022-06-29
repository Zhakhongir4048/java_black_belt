package Раздел_6_Lambda_выражения;

import java.util.ArrayList;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("Пока");
        strings.add("Ок");
        strings.add("Учим Java");
        strings.add("А именно лямбда");
        strings.removeIf(s -> s.length() < 5);
        System.out.println("strings = " + strings);
    }

}