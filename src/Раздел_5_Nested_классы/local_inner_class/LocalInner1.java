package Раздел_5_Nested_классы.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math {
    private final int a = 10;

    public void getResult() {

        // Local inner класс может обращаться к элементам блока, в котором он написан при условии,
        // что они final или effectively final
        int d = 200;

        class Division {

            private int dividend;
            private int divider;

            public int getDividend() {
                return dividend;
            }

            public void setDividend(int dividend) {
                this.dividend = dividend;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getPrivate() {
                return dividend / divider;
            }

            public int getRemainder() {
                return dividend % divider;
            }

            public int showD() {
                return d;
            }

            public void showA() {
                System.out.println(new Math().a);
            }

        }

        Division division = new Division();
        division.setDividend(21);
        division.setDivider(3);
        System.out.println(division.getDividend());
        System.out.println(division.getDivider());
        System.out.println(division.getPrivate());
        System.out.println(division.getRemainder());
        division.showA();
        System.out.println(division.showD());
    }

}
/*
Local inner класс располагается в блоках кода таких, как, например, метод или конструктор
Local inner класс не может быть static
Область видимости local inner класса - это блок, в котором он находится.
Local inner класс может обращаться даже к private элементам внешнего класса.
Local inner класс может обращаться к элементам блока, в котором он написан при условии,
что они final или effectively final
*/