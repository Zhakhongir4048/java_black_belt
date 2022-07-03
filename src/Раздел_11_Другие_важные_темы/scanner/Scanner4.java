package Раздел_11_Другие_важные_темы.scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("Привет мой друг! \nКак поживаешь? \nЧто хорошего?");
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
        scanner.close();
    }

}