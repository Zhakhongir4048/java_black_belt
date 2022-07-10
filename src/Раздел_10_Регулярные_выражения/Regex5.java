package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {

    public static void main(String[] args) {
        String s1 = "a_b_cd a_b_ce a_b_c5a_b_cg6a_b_ch";       // 3 совпадений всего.
        Pattern pattern1 = Pattern.compile("a_b_c[e-g4-7]");   // Одна буква или цифра из этих диапазонов
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Часто используемые символы в REGEX
[^d-j] – Данный символ, стоящий в начале этих
скобок, означает отрицание. Соответствует одной из
букв НЕ из диапазона d - j. – Соответствует одному любому символу.
Исключение: символ новой строки
выражение$ – Соответствует выражению в конце
строки
*/