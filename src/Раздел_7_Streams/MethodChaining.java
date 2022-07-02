package Раздел_7_Streams;

import java.util.Arrays;

public class MethodChaining {

    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int sum = Arrays.stream(array)
                .filter(element ->
                        element % 2 == 1)
                .map(operand -> {
                    if (operand % 3 == 0) {
                        operand = operand / 3;
                    }
                    return operand;
                })
                .sum();
        System.out.println("sum = " + sum);
        // 3 1 5 9 21 81 7_____________________________Нечётные числа
        // 1 1 5 3 7 27 7______________________________После деления на 3
        // result = 51_________________________________Сложили числа
    }

}
/*
Мы можем оформлять цепочку из методов - это называется метод chaining.
Source (Например коллекция, массив) -> создаём из них стрим и используем элементы стрима в наших методах
которые называются. Intermediate methods (lazy) (Intermediate) (Промежуточные методы).
Промежуточные методы также называют lazy, в конечном итоге эти элементы поступают на вход к Terminal method(eager)
(Конечному методу)

Source--                           --Terminal method
        \                        /
         \                      /
          \                    /
          Intermediate methods

Промежуточные методы обрабатывают поступающие элементы и возвращают стрим, то есть к ним пришёл и после них на output
тоже стрим. Например, мы создали стрим и после map тоже вышел стрим.
Промежуточных операторов в цепочке, в нашем методе chaining может быть много, но они не могут быть исполнены,
пока не будет вызвана терминальная операция, терминальный метод!
Intermediate methods не работают до тех пор, пока мы не вызовем Terminal method!
forEach - конечный метод
После Terminal method Intermediate methods больше не вызовешь.
Метод reduce тоже Terminal method, потому, что он не возвращает поток, а возвращает одно значение
collect - Terminal method
*/