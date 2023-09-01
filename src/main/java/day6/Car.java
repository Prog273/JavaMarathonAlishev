package day6;

public class Car {
    private String model;
    private String colour;
    private int yearOfProduction;

public void info() {
    System.out.println("Это автомобиль");
}

public int yearDifference(int inputYear) {
    return (Math.abs(inputYear - yearOfProduction));
}

    public void setModel(String newModel) {
        model = newModel;
    }
    public String getModel() {
        return model;
    }

    public void setColour(String newColour) {
        colour = newColour;
    }
    public String getColour() {
        return colour;
    }

    public void setYearOfProduction(int newYear) {
        yearOfProduction = newYear;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
