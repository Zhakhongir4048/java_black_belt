package Раздел_6_Lambda_выражения;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<Car> threeCars = createThreeCars(() -> new Car("reno", "red", "salam"));
        for (Car threeCar : threeCars) {
            System.out.println(threeCar);
        }
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

}

class Car {

    String model;
    String color;
    String engine;

    public Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

}