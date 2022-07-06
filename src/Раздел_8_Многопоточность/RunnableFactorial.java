package Раздел_8_Многопоточность;

import java.util.concurrent.*;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        Future<?> future = executorService.submit(factorial);
        executorService.shutdown();
        // Поток main ждёт 10 секунд поток executorService, если не напишем, то factorialResult будет ноль
        boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(b);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {

    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели неверное число");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        RunnableFactorial.factorialResult = result;
    }

}