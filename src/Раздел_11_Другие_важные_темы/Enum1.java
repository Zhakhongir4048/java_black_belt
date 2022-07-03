package Раздел_11_Другие_важные_темы;

import java.util.Arrays;

enum WeekDays {

    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private final String mood;

    // Конструктор всегда private неявно, он сам срабатывает, вы его вызвать не сможете
    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

}

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        WeekDays weekDays = WeekDays.MONDAY;
        System.out.println(weekDays.getMood());
        today.daysInfo();
        WeekDays weekDays2 = WeekDays.valueOf("MONDAY");
        System.out.println(weekDays2);
        WeekDays[] valuesArray = WeekDays.values();
        System.out.println("valuesArray = " + Arrays.toString(valuesArray));
    }

}

class Today {

    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Иди на работу!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Можно отдохнуть!");
        }
        System.out.println("Настроение в этот день: " + weekDays.getMood());
    }

}
/*
Enum - это способ ограничения определённого рода информации конкретным списком возможных вариантов
Конструктор в enum имеет access modifier private и не нуждается во внешнем вызове
Enum является дочерним классом для java.lang. Enum
Часто используемые методы: valueOf, values
*/