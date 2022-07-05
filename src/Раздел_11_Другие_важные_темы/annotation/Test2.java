package Раздел_11_Другие_важные_темы.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> xiaomiClass = Class.forName("Раздел_11_Другие_важные_темы.annotation.Xiaomi");
        Smartphone annotation = xiaomiClass.getAnnotation(Smartphone.class);
        String os = annotation.OS();
        int i = annotation.yearOfCompanyCreation();
        System.out.println("os = " + os);
        System.out.println("i = " + i);
        Class<?> iphoneClass = Class.forName("Раздел_11_Другие_важные_темы.annotation.Iphone");
        Smartphone iphoneClassAnnotation = iphoneClass.getAnnotation(Smartphone.class);
        String os1 = iphoneClassAnnotation.OS();
        int i1 = iphoneClassAnnotation.yearOfCompanyCreation();
        System.out.println("os1 = " + os1);
        System.out.println("i1 = " + i1);
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.model = "model1";
        xiaomi.price = 0.1D;
        Iphone iphone = new Iphone();
        iphone.model = "model2";
        iphone.price = 0.2D;
    }

}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {

    String OS() default "Android";

    int yearOfCompanyCreation() default 2010;

}

@Smartphone
class Xiaomi {

    String model;
    double price;

}

@Smartphone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {

    String model;
    double price;

}