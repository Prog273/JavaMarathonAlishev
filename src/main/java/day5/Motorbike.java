package day5;

public class Motorbike {
    private String model;
    private String colour;
    private int yearOfProd;

    public Motorbike(String model, String colour, int yearOfProd) {
        this.model = model;
        this.colour = colour;
        this.yearOfProd = yearOfProd;
    }
    public String getModel() {
        return model;
    }
    public String getColour() {
        return colour;
    }
    public int getYearOfProd() {
        return yearOfProd;
    }
}
