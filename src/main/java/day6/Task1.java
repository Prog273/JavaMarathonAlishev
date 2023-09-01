package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setYearOfProduction(2005);
        System.out.println(car1.yearDifference(2023));
    }
}
