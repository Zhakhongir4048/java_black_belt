package Раздел_8_Многопоточность;

public class DaemonExample {

    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("userThread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemonThread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main Thread ends");
    }

}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}