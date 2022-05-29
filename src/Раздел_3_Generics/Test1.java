package Раздел_3_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("привет");
        list.add("пока");
        list.add("ок");

        for (String o : list) {
            System.out.println(o + " длина " + o.length());
        }

    }
}