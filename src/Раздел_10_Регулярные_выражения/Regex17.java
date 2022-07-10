package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex17 {

    public static void main(String[] args) {
        String s1 = "hello abc Zaur dom cinema abstraction"; // 5 соответствий
        Pattern pattern1 = Pattern.compile("\\w{4}");        // Соответствует количеству повторений <<n>>
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}