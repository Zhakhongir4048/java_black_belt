package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex25 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce a_bcf_a_bcg_ab_ch";
        Pattern pattern1 = Pattern.compile("\\Aa_bcd");   // Соответствует выражению в начале String-а
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}