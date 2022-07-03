package Раздел_8_Многопоточность;

public class Ex10 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        // Выводит состояние потока
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        // Поток main будет ждать 1500
        // thread.join(1500);
        System.out.println("Method main ends");
    }

}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }

}
/*
Thread states - состояние потока
New - после создания, до вызова метода start()
Runnable - когда вызывается метод start()
Terminated - это когда работа потока завершена

Runnable делится на 2 состояния
1) ready - готовность(состоит в какой-то очереди, потому, что могут быть другие потоки)
2) running - когда поток на самом деле выполняется(после того как ОС запустила поток)

Concurrency переводится как согласованность, совпадение
Concurrent - согласованный, совпадающий, а также параллельный.
Concurrency обозначает выполнение сразу нескольких задач, необязательно в одно и в то же время. Достигается concurrency,
зависит от процессора компа.
Пример:
1) Петь и кушать, вы либо поёте, либо кушаете. Здесь одно ядро, то есть достигается за счёт context switch
2) Готовить и говорить по телефону. Здесь много ядер. 2 потока. Тут Concurrency достигается за счёт parallelism.
Concurrency означает выполнение сразу нескольких задач. В зависимости от процессора компьютера concurrency может
достигаться разными способами.
Parallelism означает выполнение 2-х и более задач в одно и то же время, т.е. параллельно. В компьютерах с многоядерным
процессором concurrency можем достигаться за счёт parallelism.
В синхронном программировании все задания выполняются последовательно, друг за другом.
Пока вы первое письмо не напишите, вы не можете приступить ко второму.
В асинхронном программировании, когда одна работа выполняется, вы можете переключиться на другую работу.
Асинхронное программирование помогает достичь нам concurrency
В синхронном программировании задачи выполняются последовательно друг за другом.
В асинхронном программировании каждая следующая задача НЕ ждёт окончания выполнения предыдущей. Асинхронное программирование
помогает достичь concurrency
*/