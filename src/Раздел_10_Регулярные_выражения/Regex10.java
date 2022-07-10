package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex10 {

    public static void main(String[] args) {
        String s1 = "a_b_cd a_bce abc5a_bcg6a_bch";     // 2 соответствия
        Pattern pattern1 = Pattern.compile("[0-9]");    // Ищу любую цифру от 0 до 9
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}