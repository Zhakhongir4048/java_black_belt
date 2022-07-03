package Раздел_11_Другие_важные_темы.scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите пару слов");
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Вы написали " + s + " " + s2);
        // До первого пробела выводит
        String s3 = scanner.next();
        System.out.println(s3);
        scanner.close();
    }

}