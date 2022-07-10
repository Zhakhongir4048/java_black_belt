package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex30 {

    public static void main(String[] args) {
        String myString = """
                12345678912345670325987;
                98765432165498750921654;
                85274196345612381122333""";
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
        // 7 группу выводим
        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(myNewString);
    }

}
/*
Классы Pattern и Matcher
Pattern myPattern = Pattern.compile(«REGEX");
Matcher myMatcher = myPattern .matcher(myString);
Пакет: java.util.regex
Методы matches и split
public boolean matches (String regex)
public String [] split (String regex)
*/