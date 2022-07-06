package Раздел_8_Многопоточность;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx3 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        // Между окончанием первого задания и второго должна пройти секунда
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl400(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        // Не надо сразу вызывать shutdown(), потому, что один раз выполниться задача, которая вверху
        scheduledExecutorService.shutdown();
        // Кэшированный Thread pool, создаёт thread по необходимости
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println(executorService);
    }

}

class RunnableImpl400 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }

}