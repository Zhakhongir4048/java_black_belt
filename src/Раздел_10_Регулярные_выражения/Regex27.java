package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex27 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bcd4 afc4ced7";                     // 5 соответствий
        Pattern pattern1 = Pattern.compile("[a_bcd][efgh3-8]");  // Один символ из первого + второй символ из второго диапазона
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}