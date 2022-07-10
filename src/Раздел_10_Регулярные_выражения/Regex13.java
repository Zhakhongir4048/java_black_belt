package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex13 {

    public static void main(String[] args) {
        String s1 = "a_b_cd a_b_ce a_b_c5a_b_cg6a_b_ch";        // 2 совпадения
        Pattern pattern1 = Pattern.compile("a_b_c[^e-g4-7]");   // ^ означает отрицание
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Часто используемые МЕТА символы в REGEX
\A – Соответствует выражению в начале String-а
\Z – Соответствует выражению в конце String-а
\b – Соответствует границе слова или числа
\B – Соответствует границе НЕ слова и НЕ числа
*/