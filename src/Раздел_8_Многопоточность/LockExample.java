package Раздел_8_Многопоточность;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::skypeCall);
        Thread thread3 = new Thread(call::whatsAapCall);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("SkypeCall call starts");
            Thread.sleep(5000);
            System.out.println("SkypeCall call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void whatsAapCall() {
        lock.lock();
        try {
            System.out.println("WhatsAap call starts");
            Thread.sleep(3000);
            System.out.println("WhatsAap call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
/*
lock()
unlock()
tryLock() - если замок открыт, то tryLock() закроет этот замок, если же замок закрыт, тогда он продолжает свой последующий код,
в синхронизированный код не заходит.
Lock - интерфейс, который имплементируется классом ReentrantLock.
Так же, как ключевое слово synchronized, Lock нужен для достижения синхронизации между потоками.
Daemon потоки предназначены для выполнения фоновых задач и оказания различных сервисов User потокам.
При завершении работы последнего User потока, программа завершает своё выполнение, не дожидаясь
окончания работы Daemon потоков.
setDaemon(true) - делаю демон потоком. Надо вызывать до запуска потока, после создания.
isDaemon() - проверяю, что поток демон
*/