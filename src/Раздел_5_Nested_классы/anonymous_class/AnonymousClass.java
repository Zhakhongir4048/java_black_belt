package Раздел_5_Nested_классы.anonymous_class;

public class AnonymousClass {

    public static void main(String[] args) {
        // Анонимный класс
        Math m = new Math() {
            final int c = 11111;

            void abc() {
            }

            @Override
            public int doOperation(int a, int b) {
                System.out.println(c);
                abc();
                return a + b;
            }
        };
        System.out.println(m.doOperation(1, 10));
        // Замена анонимного класса лямбдой
        Math m2 = (a, b) -> a + b;
        System.out.println(m2.doOperation(11, 10));
        // Ссылка на метод
        Math m3 = Integer::sum;
        System.out.println(m3.doOperation(10, 20));
        Math2 math2 = new Math2() {
            @Override
            int doOperation(int a, int b) {
                return a / b;
            }
        };
        System.out.println(math2.doOperation(1000, 2));
        System.out.println(math2.doOperation(1200, 3));
    }

}

interface Math {
    int doOperation(int a, int b);
}

class Math2 {
    int doOperation(int a, int b) {
        return a / b;
    }
}
/*
Anonymous class не имеет имени.
; обязательно ставить надо
Anonymous class - это объявление класса и одновременное создание объекта.
Anonymous class может обращаться даже к private элементам внешнего класса.
Lambda expressions - это краткая форма для написания анонимных классов.
Понятие анонимных interface не существует!
В анонимных классах мы не можем объявить конструктор
*/