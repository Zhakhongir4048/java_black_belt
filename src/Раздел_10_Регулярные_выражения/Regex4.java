package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

    public static void main(String[] args) {
        String s1 = "AB_D_OP_AB_C_OP";                      // 2 совпадения
        Pattern pattern1 = Pattern.compile("AB_[C-F]_OP");  // Соответствует одной из букв из диапазона C-F
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Часто используемые символы в REGEX
abc – Соответствует последовательно идущим abc
[abc] – Соответствует или a, или b, или c
[d-j] – Соответствует одной из букв из диапазона d - j
[3-8] – Соответствует одной из цифр из диапазона 3-8
[B-Fd-j3-8] – Соответствует одной из букв из обоих
диапазонов или одной из цифр из диапазона 3 - 8
a|b – Соответствует либо букве a, либо букве b
*/