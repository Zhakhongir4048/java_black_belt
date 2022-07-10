package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex16 {

    public static void main(String[] args) {
        String s1 = "abc_d!?abc_e====abc ++5abc_g6abc_h";   // 3 соответствия будет, т.к мы указали +
        Pattern pattern1 = Pattern.compile("\\W+");         // Одно или несколько повторений не из диапазона \w
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}