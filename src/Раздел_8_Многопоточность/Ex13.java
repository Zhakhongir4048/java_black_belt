package Раздел_8_Многопоточность;

public class Ex13 {

    static final Object lock = new Object();

    synchronized void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsAppCall call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsAppCall call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsAap());
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        Ex13 ex13 = new Ex13();
        ex13.mobileCall();
    }

}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        Ex13 ex13 = new Ex13();
        ex13.skypeCall();
    }

}

class RunnableImplWhatsAap implements Runnable {

    @Override
    public void run() {
        Ex13 ex13 = new Ex13();
        ex13.whatsappCall();
    }

}
/*
Невозможно синхронизировать конструкторы
*/