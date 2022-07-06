package Раздел_8_Многопоточность;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(4);
        // Это для интерфейса Callable<Т>, метод submit, не просто добавляет task в Thread Pool, но ещё возвращает значение
        Future<Integer> future = executorService.submit(factorial2);
        try {
            // Смотрит что task закончился
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат");
            // Смотрит что task закончился, если task не завершён ещё, то поток main lock
            factorialResult = future.get();
            System.out.println("Получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }

}

class Factorial2 implements Callable<Integer> {

    Integer f;

    public Factorial2(Integer f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

}
/*
Callable, так же как и Runnable, представляет собой определённое задание, которое выполняется потоком.
В отличие от Runnable Callable:
имеет return type не void;
может выбрасывать Exception.
Метод submit передаёт наше задание (task) в thread pool, для выполнения его одним из потоков, и возвращает
тип Future, в котором и хранится результат выполнения нашего метода.
Метод get позволяет получить результат выполнения нашего задания из объекта Future.
Runnable мы можем использовать с ExecutorService, так и при отдельном создании Thread. Callable МЫ МОЖЕМ
ИСПОЛЬЗОВАТЬ ТОЛЬКО С ExecutorService.
*/