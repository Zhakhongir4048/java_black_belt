package Раздел_8_Многопоточность;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Viktor", callBox);
        new Person("Marina", callBox);
    }

}

class Person extends Thread {
    String name;
    private final Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт...");
            // Попытка получить разрешение от Semaphore. Заблокирует этот поток, пока ресурс не будет доступен для нас
            // Когда получаем разрешение, counter Semaphore уменьшается на 1
            callBox.acquire();
            System.out.println(name + " пользуется телефоном...");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Мы освобождаем разрешение Semaphore, тем самым увеличивается counter у Semaphore на 1
            callBox.release();
        }
    }

}
/*
Semaphore - это синхронизатор, позволяющий ограничить доступ к какому-то ресурсу. В конструктор Semaphore
нужно передавать количество потоков, которым Semaphore будет разрешать одновременно использовать
этот ресурс.
Используется счётчик
*/