package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    // 1 2 3 4 .........1_000_000_000
    // 1 - 250_000_000
    // 2 - 250_000_001 до 500_000_000
    // 3 - 500_000_001 до 750_000_000
    // 4 - 750_000_001 до 1_000_000_000

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        double sumResult = list.parallelStream().reduce(Double::sum).orElse(0.0);
        System.out.println("sumResult = " + sumResult);
        double divisionResult = list.parallelStream().reduce(Double::sum).orElse(0.0);
        System.out.println("divisionResult = " + divisionResult);
    }
}
/*
Parallel Stream - параллельные потоки
Когда мы работаем со Stream, by default по умолчанию используется последовательные потоки.
Все примеры которые мы рассматривали до этого, использовали последовательные потоки.
То есть, нам надо самим указать, что мы хотим использовать Parallel Stream.
Parallel Stream - это возможность использования нескольких ядер процессора при выполнении каких-либо
операций со stream.
Суть его - выполнение частей задания и объединение результатов заданий.
Использование Parallel Stream подходит для агрегированных функций(мин, мак, сумма) , и абсолютно не подходит когда
наше действие над элементами напрямую зависит от их очередности.
Parallel Stream нужно использовать тогда, когда у вас много элементов.
list.parallelStream(). ...
Stream<T> s = Stream.of(...);
s.parallel(). ...
*/