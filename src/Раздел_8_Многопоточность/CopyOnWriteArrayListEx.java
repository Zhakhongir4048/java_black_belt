package Раздел_8_Многопоточность;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Zaur");
        list.add("Oleg");
        list.add("Sergey");
        list.add("Ivan");
        list.add("Igor");
        System.out.println(list);

        Runnable runnable = () -> {
            for (String s : list) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s);
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Elena");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
/*
CopyOnWriteArrayList реализует интерфейс List
CopyOnWriteArrayList следует использовать тогда, когда вам нужно добиться безопасности потока, у вас небольшое
количество операций по изменению элементов и большое количество по их чтение.
*/