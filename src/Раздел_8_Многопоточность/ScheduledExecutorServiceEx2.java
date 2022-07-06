package Раздел_8_Многопоточность;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx2 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
         /* Впервые эта задача обработается через 3 секунды, после запуска метода scheduleAtFixedRate,
         потом через 1 секунду будет выполняться, надо чтобы поток начал спать.
         */
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl300(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        // Не надо сразу вызывать shutdown(), потому, что один раз выполниться задача, которая вверху
        scheduledExecutorService.shutdown();
    }

}

class RunnableImpl300 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        System.out.println(Thread.currentThread().getName() + " ends work");
    }

}