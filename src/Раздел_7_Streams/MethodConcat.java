package Раздел_7_Streams;

import java.util.stream.Stream;

public class MethodConcat {

    public static void main(String[] args) {
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        stream4.forEach(System.out::println);
    }

}
/*
Concat делает конкатенацию. Метод статический и возвращает Stream, не может быть использован в цепочке Chaining
Например у нас 2 Стрима, мы можем объединить их благодаря этому методу
Не буду указывать к какому семейству методу он относится!
*/