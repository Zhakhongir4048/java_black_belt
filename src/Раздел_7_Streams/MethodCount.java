package Раздел_7_Streams;

import java.util.stream.Stream;

public class MethodCount {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        long count = stream1.count();
        System.out.println("count = " + count);
    }

}
/*
Метод count - терминальный метод (Terminal method), считает количество элементов в Stream и возвращает long
Stream после обработки нельзя переиспользовать, будет выбрасываться IllegalStateException
Вот так нельзя делать
        System.out.println(stream5.count());
        System.out.println(stream5.distinct().count());
*/