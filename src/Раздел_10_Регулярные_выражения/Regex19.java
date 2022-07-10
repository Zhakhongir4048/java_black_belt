package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex19 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce abc5a_bcg6a_bch";      // 2 соответствия
        Pattern pattern1 = Pattern.compile("\\d");  // Ищу любую цифру от 0 до 9. Соответствует одной цифре
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}