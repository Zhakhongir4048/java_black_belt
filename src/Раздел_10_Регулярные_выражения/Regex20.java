package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex20 {

    public static void main(String[] args) {
        String s1 = "a_bcd a_bce3 a_bcf_a78a_bcg6a!!!!!!!!!!!!!!!";
        Pattern pattern1 = Pattern.compile("\\D{2,6}"); // Количество повторений от 2 до 6
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}