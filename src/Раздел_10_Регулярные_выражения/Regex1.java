package Раздел_10_Регулярные_выражения;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {
        String s
                = "Иванов Василий, Россия, Москва, Ленина улица, 51, Flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                + "Петрова Мария, Ukraine, Киев, Ломоносова улица, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, Улица всех звёзд, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        // Находим все слова в выражении
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-------------------");

        // Находим все номера домов и квартир. \\b - Соответствует границе слова или числа
        Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b");
        matcher = pattern2.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-------------------");

        // Находим все номера телефона
        Pattern pattern3 = Pattern.compile("\\+\\d{9}\\b");
        matcher = pattern3.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-------------------");

        // Находим все email
        Pattern pattern4 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        matcher = pattern4.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-------------------");

        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(ru|com)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));

        matcher = pattern4.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
/*
Regular Expressions
Регулярные выражения необходимы для создания
шаблонов, с помощью которых производят такие
операции, как поиск, сравнение, замена.
Регулярные выражения - это совокупность
символов, некоторые из которых являются
специальными - мета символами, т.е. обладают
каким-то функционалом.
*/