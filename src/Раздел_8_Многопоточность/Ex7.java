package Раздел_8_Многопоточность;

public class Ex7 implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
        // Показывает текущий поток, в каком потоке мы находимся
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex7());
        thread.start();
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());

    }

}