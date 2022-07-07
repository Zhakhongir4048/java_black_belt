package Раздел_8_Многопоточность;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Zaur");
        map.put(2, "Oleg");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        System.out.println(map);

        Runnable runnable = () -> {
            for (Integer integer : map.keySet()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(integer + ":" + map.get(integer));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }

}
/*
ConcurrentHashMap реализует интерфейс ConcurrentMap, который в свою очередь происходит от интерфейса Map
ConcurrentHashMap делит множество элементов на сегменты. Сегмент это каждый элемент массива, который сидит в основе
ConcurrentHashMap.
Segment Locking
В ConcurrentHashMap любое количество потоков может читать элементы не блокируя его.
В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется только bucket, в
котором он находится
В ConcurrentHashMap ни key, ни value не могут быть null.
*/