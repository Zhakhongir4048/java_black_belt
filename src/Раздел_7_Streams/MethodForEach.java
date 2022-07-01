package Раздел_7_Streams;

import java.util.Arrays;

public class MethodForEach {

    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(value -> System.out.println(value * 2));
        System.out.println("------------");
        Arrays.stream(array).forEach(value -> {
            value = value * 2;
            System.out.println(value);
        });
        System.out.println("------------");
        // Метод reference, мы даём ссылку на наш метод println
        // Мы говорим что этот метод находится в System.out, в параметр println поставляем каждый элемент нашего стрима
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("------------");
        // Каждый элемент потока помести в метод myMethod в качестве параметра, который находится в классе Utils
        Arrays.stream(array).forEach(Utils::myMethod);
    }

}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println(a);
    }
}
/*
ForEach - возвращает void, после него нельзя создать List с помощью collect()
Метод ForEach помогает нам проходиться по всем элементам например, показывать, выводить на экран эти элементы.
Могу удвоить каждый элемент моего стрима и вывести на экран, для этого пишу
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el-> {el*= 2;
        System.out.println(el);});

Никакой необходимости в преобразования в List и так далее, ничего нет.
Мы можем просто запустить наш код
Необязательно создавать Stream из готовой коллекции или с массива готового.
Мы можем создать его с нуля
Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
 */