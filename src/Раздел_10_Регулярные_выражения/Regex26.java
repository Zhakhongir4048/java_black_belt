package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex26 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce a_bc_fa_bc_ga_bch";            // 2 соответствия
        Pattern pattern1 = Pattern.compile("bch\\Z");    // Соответствует выражению в конце String-а
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}