package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

    public static void main(String[] args) {
        String s1 = "a_b_cd a_b_ce a_b_c5a_b_cg6a_b_c_h";   // 2 соответствия
        Pattern pattern1 = Pattern.compile("a_b_c(e|5)");   // Соответствует либо букве e, либо цифре 5
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}