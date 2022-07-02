package Раздел_7_Streams;

import java.util.stream.Stream;

public class MethodDistinct {

    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream5.distinct().forEach(System.out::println);
    }

}
/*
Метод distinct() - intermediate метод, возвращает Stream уникальных элементов, а проверяет он их с помощью метода equals
*/