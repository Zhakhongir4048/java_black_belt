package Раздел_8_Многопоточность;

public class Ex2 {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
//      Методом start мы запускаем поток, метод run вызывается автоматически JVM, после того как вызвали метод start
        myThread1.start();
        myThread2.start();
        thread2.start();
    }

}

class MyThread1 extends Thread {

    // Пишем логику в методе, которая будет для потока
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);

        }
    }

}

class MyThread2 extends Thread {

    // Пишем логику в методе, которая будет для потока
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);

        }
    }

}
/*
Внутри потока main были отсоединены другие потоки.
// Создание
class MyThread extends Thread { public void run(){ код } }
// Запуск
new MyThread().start();
*/