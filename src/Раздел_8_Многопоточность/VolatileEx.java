package Раздел_8_Многопоточность;

public class VolatileEx extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }

}
/*
В многопоточных программах, где методы работают с переменными, каждый поток может скопировать значение переменной из
общей памяти, которая называется Main Memory(она содержит значение переменных). Каждый поток может скопировать
значение переменных в cache CPU. Это производится для быстрого доступа. Чтобы ядру каждый раз не обращаться к общей
памяти, у него есть свой cache, он копирует значение переменных туда.
Когда переменная у нас volatile, её значение будет храниться только в Main Memory(в общей памяти)
Потоки будут обращаться напрямую к общей памяти за значением переменной, если она помечена как volatile
Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда, когда только один
потом может изменять значение этой переменной, а остальные потоки могут его только читать.
Операция не атомарно, это значит, что она состоит из нескольких частей.
*/