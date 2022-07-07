package Раздел_8_Многопоточность;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
        // Увеличь и дай
        counter.incrementAndGet();
        // Буду увеличивать не на 1, а на 5
        counter.addAndGet(5);

        // 200 раз будет от 0 отнята 5
        counter.addAndGet(-5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl18());
        Thread thread2 = new Thread(new MyRunnableImpl18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

}

class MyRunnableImpl18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }

}
/*
AtomicInteger - это класс, который предоставляет возможность работать с целочисленным значением int,
используя атомарные операции.
incrementAndGet
getAndIncrement
*/