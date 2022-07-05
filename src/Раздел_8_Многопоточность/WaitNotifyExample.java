package Раздел_8_Многопоточность;

public class WaitNotifyExample {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread.start();
        thread2.start();
    }

}

class Market {

    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Потребитель купил один хлеб");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            if (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                breadCount++;
                System.out.println("Производитель добавил на витрину один хлеб");
                System.out.println("Количество хлеба в магазине = " + breadCount);
                lock.notify();
            }
        }
    }

}

class Consumer implements Runnable {

    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }

}

class Producer implements Runnable {

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }

}
/*
Для извещения потоком других потоков о своих действиях часто используются следующие методы:
wait-освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой
поток не вызовет метод notify();
notify() - НЕ освобождает монитор и будит поток, у которого ранее был вызван метод wait().
notifyAll() - НЕ освобождает монитор и будит все потоки, у которых ранее был вызван метод wait().
*/