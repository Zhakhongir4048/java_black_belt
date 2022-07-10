package Раздел_10_Регулярные_выражения;

public class Regex29 {

    public static void main(String[] args) {
        String s1 = "Привет,     мой друг!   Как идёт изучение     Java        ?";
        System.out.println(s1);
        s1 = s1.replace("Java", "SQL");
        System.out.println(s1);
    }

}