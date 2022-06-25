package Раздел_4_Коллекции;

import java.util.Stack;

public class StackExample2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Заур");
        stack.push("Миша");
        stack.push("Олег");
        stack.push("Катя");
        System.out.println("stack = " + stack);
        System.out.println(stack.pop());
        System.out.println("stack = " + stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }

}
/*
Stack - устаревший synchronized класс. Использует принцип LIFO
Не рекомендован для использования.
Методы, которые вызывают другие методы, выполняются тоже в STACK-е.
Метод push - вставляет элемент на самый вверх нашего stack.
Метод pop - возвращает элемент, который находится на самом верху stack и сразу его удаляет.
Если мы будем применять метод pop к пустому Stack, выйдет EmptyStackException
Метод peek - просматриваем какой элемент находится на самом верху стека.
Метод isEmpty - проверяем пустой Stack
*/