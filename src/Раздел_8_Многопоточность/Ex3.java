package Раздел_8_Многопоточность;

public class Ex3 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();
    }

}

class MyThread3 implements Runnable {

    // Пишем логику в методе, которая будет для потока
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);

        }
    }

}

class MyThread4 implements Runnable {

    // Пишем логику в методе, которая будет для потока
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);

        }
    }

}
/*
Runnable - это функциональный интерфейс, где один абстрактный метод run()
Класс Thread реализует интерфейс Runnable
*/