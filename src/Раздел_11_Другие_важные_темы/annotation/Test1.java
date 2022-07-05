package Раздел_11_Другие_важные_темы.annotation;

public class Test1 {

    public static void main(String[] args) {
        Parent p = new Child("Дима");
        p.showInfo();
    }

}

class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Это класс-родитель. Имя = " + name);
    }

}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Это класс-наследник. Имя = " + name);
    }

}