package Раздел_8_Многопоточность;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {

    public static void main(String[] args) throws InterruptedException {
        // Создание ThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Создаёт один Thread
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService2.execute(new RunnableImpl100());
        }

        // Метод shutdown() говорит нам, что когда задач не будет, заверши программу
        executorService.shutdown();
        executorService2.shutdown();
        // awaitTermination выполняется всегда после shutdown
        boolean b = executorService.awaitTermination(5, TimeUnit.SECONDS);
        boolean b2 = executorService2.awaitTermination(7, TimeUnit.SECONDS);
        System.out.println(b);
        System.out.println(b2);
        System.out.println("Main ends");
    }

}

class RunnableImpl100 implements Runnable {

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
/*
Thread pool - это множество потоков, каждый из которых предназначен для выполнения той или иной задачи.
В java с thread pool-ами удобнее всего работать посредством ExecutorService.
Напрямую Thread pool практически никогда не создают.
Thread pool удобнее всего создавать, используя factory методы класса Executors:
Executors.newFixedThreadPool(int count) - создаст pool с 5-ю потоками;
Executors.newSingleThreadExecutor() - создаст pool с одним потоком.
Метод execute() передаёт наше задание (task) в thread pool, где оно выполняется одним из потоков.
После выполнения метода shutdown() ExecutorService понимает, что новых заданий больше не будет и, выполнив
поступившие до этого задания, прекращает работу.
Метод awaitTermination принуждает поток в котором он вызвался подождать до тех пор, пока не выполнится одно
из двух событий: либо ExecutorService прекратит свою работу, либо пройдёт время, указанное в параметре
метода awaitTermination
*/