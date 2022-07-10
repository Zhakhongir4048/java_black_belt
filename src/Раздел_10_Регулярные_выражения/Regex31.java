package Раздел_10_Регулярные_выражения;

public class Regex31 {

    public static void main(String[] args) {
        String s1 = "Привет,     мой друг!   Как идёт изучение     Java        ?";
        System.out.println(s1);
        String s = s1.replaceAll(" {2,}", " ");
        System.out.println(s);
    }

}