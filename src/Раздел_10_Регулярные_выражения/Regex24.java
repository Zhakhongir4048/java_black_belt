package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex24 {

    public static void main(String[] args) {
        String s1 = "DABCDABABDA";                      // 2 соответствия
        Pattern pattern1 = Pattern.compile("D(AB)*");   // Говорит о том, что за D может идти 0 или n-ное AB, а может и не идти
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}