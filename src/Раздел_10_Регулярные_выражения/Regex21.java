package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex21 {

    public static void main(String[] args) {
        String s1 = "ABCABABDA";                         // Одно соответствие будет только найдено ABAB
        Pattern pattern1 = Pattern.compile("(AB){2,3}"); // Будет соответствовать вот такому выражению ABAB или ABABAB
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}