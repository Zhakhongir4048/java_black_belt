package Раздел_11_Другие_важные_темы.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        System.out.println("Введённое число " + i);
        System.out.println("Напишите 2 числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Частное = " + x / y);
        System.out.println("Остаток = " + x % y);
        scanner.close();
    }

}