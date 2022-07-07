package Раздел_8_Многопоточность;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionEx2 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);
        Runnable runnable1 = () -> {
            synchronized (synchronizedList) {
                for (Integer integer : synchronizedList) {
                    System.out.println(integer);
                }
            }
        };
        Runnable runnable2 = () -> synchronizedList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizedList);
    }

}
/*
iterator-ы подвержены сбоям при работе в многопоточном программировании
Работу итератора надо заключать в synchronized блоке.
*/