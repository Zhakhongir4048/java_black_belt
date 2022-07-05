package Раздел_8_Многопоточность;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Мы убедились, что состояние всех объектов нормальное и " +
                        "решили завершить работу потока");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. " +
                        "Давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }
    }

}
/*
У нас есть возможность послать сигнал потоку, что мы хотим его прервать.
У нас также есть возможность в самом потоке проверить, хотят ли его прервать.
Что делать, если данная проверка показала, что поток хотят прервать, должен решать
сам программист.
interrupt()
isInterrupted()
*/