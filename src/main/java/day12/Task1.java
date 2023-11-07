package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Lada");
        cars.add("Kia");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add(3, "BMW");
        cars.remove(0);
        System.out.println(cars);

    }
}
