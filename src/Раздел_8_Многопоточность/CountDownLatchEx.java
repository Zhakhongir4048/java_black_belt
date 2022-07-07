package Раздел_8_Многопоточность;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        // Уменьшаем счётчик на единицу
        countDownLatch.countDown();
        // Получаем значение счётчика countDownLatch
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        // Уменьшаем счётчик на единицу
        countDownLatch.countDown();
        // Получаем значение счётчика countDownLatch
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        // Уменьшаем счётчик на единицу
        countDownLatch.countDown();
        // Получаем значение счётчика countDownLatch
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Заур", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }

}

class Friend extends Thread {
    String name;
    private final CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            // Если наш счётчик больше нуля, то наш поток будет заблокирован, то тех пор, пока счётчик не станет равен нулю
            countDownLatch.await();
            System.out.println(name + " приступил(а) к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
CountDownLatch синхронизатор с обратным отсчётом
CountDownLatch - это синхронизатор, позволяющий любому количеству потоков ждать пока
не завершится определённое количество операций. В конструктор CountDownLatch нужно
передавать количество операций, которые должны завершится, чтобы потоки продолжили
свою работу.
Методы  - await, countDown, getCount
*/