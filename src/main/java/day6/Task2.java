package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Su", 2020, 20, 35);
        airplane.setYear(2023);
        airplane.setLength(29);
        airplane.fillUp(500);
        airplane.fillUp(450);
        airplane.info();
    }

}
