package Раздел_8_Многопоточность;

public class Ex9 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex9 thread2 = new Ex9();
        thread1.start();
        thread2.start();
        /*
        Объясняет потоку main, что надо дождаться завершения потоков, код потока main после этого выполнится
        Поток, в котором вызывается join(). В котором, а не - на котором. Мы вызываем join() внутри потока main,
        тогда main будет ждать тот поток, на котором вызван метод join()
         */
        thread1.join();
        thread2.join();
        System.out.println("Конец!");
    }

}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
/*
InterruptedException - если один поток просит другой поток остановиться, а этот поток, которому мы просим остановиться,
находиться в состоянии спячки, то будет выброшен InterruptedException
*/