package Раздел_8_Многопоточность;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.LongStream;

public class SumNumbers2 {
    private static final long value = 1_000_000_000L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newScheduledThreadPool(10);
        List<Future<Long>> result = new ArrayList<>();
        long valueDividedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long to = valueDividedBy10 * (i + 1);
            long from = valueDividedBy10 * i + 1;
            Future<Long> futurePartialSum = executorService.submit(new PartialSum(from, to));
            result.add(futurePartialSum);
        }
        long sum = result.stream().flatMapToLong(future -> {
            try {
                return LongStream.of(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            return null;
        }).sum();
        executorService.shutdown();
        System.out.println(sum);
    }

}