package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Ural", "white", 2023);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColour());
        System.out.println(motorbike.getYearOfProd());
    }
}
