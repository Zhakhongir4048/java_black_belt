package Раздел_7_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChaining3 {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        List<Integer> list = stream1.filter(el -> {
            System.out.println("!!!");
            return el % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(list);
    }

}