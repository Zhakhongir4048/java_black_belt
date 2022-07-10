package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex22 {

    public static void main(String[] args) {
        String s1 = "DABCDABABDABABABABD";                 // 2 соответствия
        Pattern pattern1 = Pattern.compile("D(AB){2,}");   // Соответствует DABAB или может AB повторяться не меньше двух раз
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}