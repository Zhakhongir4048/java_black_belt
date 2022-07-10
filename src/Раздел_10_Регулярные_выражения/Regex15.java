package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex15 {

    public static void main(String[] args) {
        String s1 = "abc_d!?abc_e====abc ++5ab_cg6abc_h"; // 9 соответствий
        Pattern pattern1 = Pattern.compile("\\W");        // Соответствует одному символу, который не буква, не цифра и не "_"
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Часто используемые символы в REGEX,
обозначающие количество повторений
выражение? – Соответствует 0 или 1 повторению
выражение* – Соответствует 0 или большему
количеству повторений
выражение+ – Соответствует 1 или большему
количеству повторений
выражение{n} – Соответствует количеству
повторений «n»
выражение{m, n} – Соответствует количеству
повторений от «m» до «n»
выражение{n,} – Соответствует n или большему
количеству повторений
*/