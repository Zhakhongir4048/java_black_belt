package Раздел_11_Другие_важные_темы.scanner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner5 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner
                (new FileReader("test.txt"));
        Set<String> set = new TreeSet<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            set.add(next);
        }
        for (String s : set) {
            System.out.println(s);
        }
        scanner.close();
    }

}