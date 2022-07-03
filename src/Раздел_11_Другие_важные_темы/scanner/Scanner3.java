package Раздел_11_Другие_важные_темы.scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        System.out.println("v = " + v);
        scanner.close();
    }

}