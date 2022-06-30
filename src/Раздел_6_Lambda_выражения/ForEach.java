package Раздел_6_Lambda_выражения;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = List.of("привет", "как дела?", "нормально", "пока");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        list.forEach(System.out::println);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("-----------");
        list2.forEach(integer -> {
                    System.out.println(integer);
                    integer = integer * 2;
                    System.out.println(integer);
                }
        );
    }

}