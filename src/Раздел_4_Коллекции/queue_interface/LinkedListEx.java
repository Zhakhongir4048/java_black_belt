package Раздел_4_Коллекции.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Заур");
        queue.offer("Олег");
        queue.offer("Иван");
        queue.offer("Мария");
        queue.offer("Александр");
        System.out.println("queue = " + queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
    }

}
/*
Queue - базовый интерфейс, который хранит последовательность элементов для какой-либо обработки.
Используется для того, чтобы проводить операции с самым первым стоящим в очереди элементом.
FIFO (First In First Out)
Not synchronized
Queue - это коллекция, хранящая последовательность элементов. Добавляется элемент в конец очереди, используется
из начала очереди - правило FIFO.
LinkedList является одним из самых распространённых классов, которые используются когда нам нужна очередь.
Класс LinkedList реализует не только интерфейс List, но и интерфейс Deque.
Метод add добавляет элемент в конец очереди.
Наши очереди не ограничены количеством элементов.
Если у нас ограниченная очередь, и мы хотим уже в заполненную очередь добавить элемент с помощью add,
то выбросится исключение.
Если мы будем применять метод offer при добавлении элементов в очередь и выводить на экран,
при этом наша очередь ограничена 4 людьми, то никакой exception не выбрасывался бы, просто мы не могли бы
добавить этот элемент,
poll удаляет элементы, без выброса exception, вернёт null
element - показывает верхний элемент в очереди, то есть первый элемент, выбрасывает exception
peek также выводит первый элемент очереди, но exception не выбрасывает
Мы можем удалять элемент из середины очереди.
*/