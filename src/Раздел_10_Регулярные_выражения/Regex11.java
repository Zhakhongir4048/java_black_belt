package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex11 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce abc5a_bcg6a_bch";     // Много соответствий
        Pattern pattern1 = Pattern.compile("\\D");     // Соответствует одному символу, только не цифре
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Часто используемые МЕТА символы в REGEX
\d – Соответствует одной цифре
\D – Соответствует одной НЕ цифре
\w – Соответствует одной букве, цифре или «_»
\W – Соответствует одному символу, который НЕ
буква, НЕ цифра и НЕ «_»
\s – Соответствует пробельному символу
\S – Соответствует НЕ пробельному символу
*/