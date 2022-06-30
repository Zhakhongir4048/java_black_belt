package Раздел_6_Lambda_выражения;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test5 {

    public static void main(String[] args) {
        changeCar(new Car("Nissan", "red", "1.6"), car -> {
            char[] chars = car.color.toCharArray();
            System.out.println(Arrays.toString(chars));
        });
        changeCar(new Car("Nissan", "red", "1.6"), car -> {
            car.color = "black";
            car.engine = "3.2";
            car.model = "BMW";
            System.out.println(car);
        });
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

}