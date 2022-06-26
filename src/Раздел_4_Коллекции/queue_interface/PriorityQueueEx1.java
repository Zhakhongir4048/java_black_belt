package Раздел_4_Коллекции.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // Наивысший приоритет имеет наименьший элемент
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        // 1 4 7 8 10

        // Когда не используем элемент(-ы), то вывод будет не отсортирован по приоритету
        System.out.println(priorityQueue);

        // Наивысший приоритет имеет наименьший элемент. Вывод: 1
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }

}