package Раздел_8_Многопоточность;

public class Ex5 {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Privet")).start();
    }

}