package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex8 {

    public static void main(String[] args) {
        String s1 = "a_b_cd a_b_ce a_b_c5a_b_cg6a_b_ch";  // Одно соответствие
        Pattern pattern1 = Pattern.compile("^a_b_c");     // ^выражение - Соответствует выражению в начале строки
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}