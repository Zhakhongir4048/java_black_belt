package Раздел_8_Многопоточность;

public class Ex12 {

    static int counter = 0;

    public synchronized static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Ex12.increment();
        }
    }

}
/*
Data race - это проблема, которая может возникнуть, когда, две и более потоков обращаются к
одной и той же переменной и как минимум 1 поток её изменяет.
*/