package Раздел_8_Многопоточность;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }

}

class Employee extends Thread {

    private final String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(2000);
                System.out.println(name + "завершил(а) свои дела");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }

}
/*
Thread pool - это множество потоков, каждый из которых предназначен для выполнения той или иной задачи.
В java с thread pool-ами удобнее всего работать посредством ExecutorService.
*/