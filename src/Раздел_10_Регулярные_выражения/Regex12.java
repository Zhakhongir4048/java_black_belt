package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex12 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce abc5a_bcg6a_bch";     // Все символы выведутся тут, кроме пробелов
        Pattern pattern1 = Pattern.compile("\\w");     // Соответствует одной букве, цифре или "_"
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}