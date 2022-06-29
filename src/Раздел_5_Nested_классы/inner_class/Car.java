package Раздел_5_Nested_классы.inner_class;

public class Car {

    private final String color;
    private final int doorCount;
    private Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        // Вот так создаётся inner class, this текущий объект класса Car
        // Inner class всегда задействован с внешним классом
        this.engine = this.new Engine(horsePower);
    }

    public Car(String color, int doorCount) {
        Engine engine = new Engine(444);
        // Внешний класс может обращаться даже к private элементам inner класса, прежде чем создав его объект
        System.out.println(engine.horsePower);
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {

        private final int horsePower;
        // Чисто static не можем использовать в inner классе, только с final!
        private final static int A = 4;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(A);
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }

    }

}

// Car.Engine engine2 = new car.Engine(150);  Так нельзя писать в nested class-е
// Inner class может содержать только non static элементы, но константу можем сделать!
class Test {

    public static void main(String[] args) {
        Car car1 = new Car("black", 4, 300);
        Car.Engine engine = car1.new Engine(150);
        Car car2 = new Car("black", 4);
        car2.setEngine(engine);
        System.out.println("engine = " + engine);
        System.out.println("car2 = " + car2);
        // Вот так делать можно, но теряется ссылка на Car, не самый распространённый вариант
        Car.Engine car3 = new Car("yellow", 4).new Engine(200);
        System.out.println("car3 = " + car3);
    }

}
