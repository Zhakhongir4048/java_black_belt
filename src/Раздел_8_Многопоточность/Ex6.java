package Раздел_8_Многопоточность;

public class Ex6 {

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("мой поток");
        myThread5.setPriority(9);
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Имя myThread5 = " + myThread5.getName() +
                ", Приоритет myThread5 = " + myThread5.getPriority());

    }

}

class MyThread5 extends Thread {

    @Override
    public void run() {
        System.out.println("privet");
    }

}
/*
Методы Thread
setName - устанавливаем имя потока
getName - получаем имя потока
setPriority - устанавливаем приоритет
getPriority - получаем приоритет
*/