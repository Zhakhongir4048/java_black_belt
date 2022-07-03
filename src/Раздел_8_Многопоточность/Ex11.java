package Раздел_8_Многопоточность;

public class Ex11 {

    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter {
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }

}
/*
Монитор - это сущность/механизм, благодаря которому достигается корректная работа при синхронизации
Любая блокировка с помощью синхронизации идёт на объекте или на классе, а не на каком-то коде
*/