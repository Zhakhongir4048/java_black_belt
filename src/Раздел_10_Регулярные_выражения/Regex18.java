package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex18 {

    public static void main(String[] args) {
        String s1 = "buy     abc           Zaur dom   cinema abstraction";
        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // \s - Соответствует пробельному символу. Вот такой диапазон[\t\n\r\f]
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
\S - Соответствует не пробельному символу. Например, это может быть знак препинания, любая цифра, любая буква
*/