package Раздел_8_Многопоточность;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        // Выполни задание через 3 секунды
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
        }
        // Программа завершается
        scheduledExecutorService.shutdown();
    }

}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }

}
/*
Когда нам необходимо запускать поток или несколько потоков из Thread pool по какому-то расписанию, то мы
используем ScheduledExecutorService
Данный pool создаётся, используя factory метод класса Executors:
Executors.newScheduledThreadPool(int count)
*/