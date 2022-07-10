package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

    public static void main(String[] args) {
        String s1 = "O_P_A_B_M_N_C_D";   // 3 совпадения
        Pattern pattern1 = Pattern.compile("[ABC]");  // Соответствует или A, или B, или C
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}