package Раздел_8_Многопоточность;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
    }

}
/*
add - выбрасывает Exception, когда очередь полная
offer - не выбрасывает Exception, когда очередь полная
ArrayBlockingQueue - поток-безопасная очередь с ограниченным размером (capacity restricted)
Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки
забирают элементы из начала очереди.
*/