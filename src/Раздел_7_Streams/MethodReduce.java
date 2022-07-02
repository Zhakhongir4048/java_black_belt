package Раздел_7_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        /* 2 варианта метода reduce
         * 1 вариант
         * В лямбде выражении я указываю 2 параметра
         * После того как мы на листе вызываем stream(), у нас появляется стрим, который содержит элементы 5, 8, 2, 4, 3;
         * accumulator - это то, что накапливает, ему присваивается первое значение нашего потока стрим (5)
         * element - второе значение присваивается ему. (8)
         * Весь проход
         * accumulator = 5__40__80__320
         * element = ____8__2___4___3
         * Возвращает потом один результат
         * Метод get() нужен! Метод reduce возвращает Optional.
         * Чтобы получить из Optional значения, мы можем использовать метод get()
         * Объект типа Optional делает rup, то есть оборачивает собой объект Integer в данном случае.
         * Является контейнером для нашего конкретного значения, Optional может содержать NULL и NOT-NULL значения
         * {960}, существует куча ситуаций, когда reduce может вернуть null, тогда Optional нам очень нужен
         * Чтобы просто на ура get() не использовать, потому, что может вернуться null значение, мы можем проверить на
         * присутствие это значение методом isPresent()
         * 2 вариант
         * Мы можем добавить ещё один параметр в метод reduce(), который будет являться аккумулятором.
         * Когда мы добавляем ещё один параметр в метод reduce() на первое место, он будет являться первичным значением
         * нашего аккумулятора
         * accumulator = 1___5____40___80_____320___960
         * element =_____5___8____2____4______3
         */
        // 1 вариант reduce
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        // 2 вариант reduce
        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        System.out.println(result2);

        // Использование Optional
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
                accumulator * element);
        System.out.println(o.get());
        System.out.println(list100);
        // Найдём для листа, который содержит String конкатенацию всех его элементов
        List<String> list3 = new ArrayList<>();
        list3.add("привет");
        list3.add("как дела?");
        list3.add("ок");
        list3.add("пока");
        String result3 = list3.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result3);
    }

}
/*
Reduce(уменьшить) - когда мы применяем Reduce для стрима, на выходе всегда получаем один элемент.
То есть уменьшаем n количество элементов в стриме до одного, то есть здесь удобно выполнять агрегированные функции
(суммирование, умножение).
 */