package Раздел_10_Регулярные_выражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {
        String s1 = "SALAM SALAM_E SALAM_F_SALAM_G_SALAM_H"; // Таких 5 соответствий
        // Класс Pattern - создаёт шаблон
        Pattern pattern1 = Pattern.compile("SALAM");  // Последовательно SALAM идущие
        // Класс Matcher - находит соответствие
        Matcher matcher = pattern1.matcher(s1);
        // Метод find() возвращает true или false, если совпадение было найдено
        // Метод start() находит позицию соответствия
        // Метод group() выводит искомое значение
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }

}
/*
Регулярные выражения необходимы для создания шаблонов, с помощью которых производят такие операции,
как поиск, сравнение, замена.
Регулярные выражения - это совокупность символов, некоторые из которых являются специальными - мета-символами,
т.е. обладают каким-то функционалом.
*/