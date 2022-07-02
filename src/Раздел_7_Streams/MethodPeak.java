package Раздел_7_Streams;

import java.util.stream.Stream;

public class MethodPeak {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
/*
Метод peak - принимает в параметр Consumer, но в отличие от forEach данный метод возвращает не void, а Stream.
Поэтому он является Intermediate методом. Обычно этот метод нужен, чтобы посмотреть, как проходит поэтапно
наш метод chaining
*/