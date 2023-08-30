package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColour("red");
        System.out.println(car1.getColour());

        car1.setYearOfProduction(2005);
        System.out.println(car1.getYearOfProduction());

        car1.setModel("Kia Rio");
        System.out.println(car1.getModel());
    }
}
