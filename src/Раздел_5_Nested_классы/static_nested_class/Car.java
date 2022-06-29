package Раздел_5_Nested_классы.static_nested_class;

public class Car {

    private final String color;
    private final int doorCount;
    private final Engine engine;
    private static int countOfObjects;
    private static int a;

    interface Power {
    }

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    public static int getA() {
        return a;
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        countOfObjects++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {

        private final int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            a++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }

    }

}

class Test {

    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println("engine = " + engine);
        Car car = new Car("red", 4, engine);
        System.out.println("car = " + car);
        Z z = new Z(200);
        System.out.println("z = " + z);
        System.out.println(Car.getA());
        System.out.println(Car.getCountOfObjects());
        A a = new A() {
            @Override
            public String toString() {
                return "SALAM";
            }
        };
        System.out.println(a);
        A.D d = new A.D();
        System.out.println(d);
        Car.Power power = new Car.Power() {
            @Override
            public String toString() {
                return "POWER";
            }
        };
        System.out.println(power);
    }

}

class Z extends Car.Engine {

    public Z(int horsePower) {
        super(horsePower);
    }

}

interface A {
    class D {
        @Override
        public String toString() {
            return "SALAM от D";
        }
    }
}
/* static nested class ведёт себя как обычный класс, мы можем без создания внешнего класса создать static nested class
Car.Engine engine = new Car.Engine(256);  Можем вот так создавать только
Car.Engine engine2 = new car.Engine(150); Вот так не можем создавать
Если мы сделаем класс Engine - private, то за пределы класса Car, мы создать объект класса Engine не сможем
Мы можем static nested class объявить как final, abstract, можем наследоваться от другого класса или наоборот
Внутри класса мы можем создать nested interface, также внутри интерфейса мы можем создать nested классы
Мы можем обращаться к переменным(static и non static переменным) static nested class из внешнего класса
*/