package Раздел_10_Регулярные_выражения;

public class Regex33 {

    public static void main(String[] args) {
        String s1 = "Привет,  item   мой друг!   Как идёт изучение  item   Java   i     ?";
        System.out.println(s1);
        String s = s1.replaceFirst("\\bi\\w+", "4444");
        System.out.println(s);
    }

}