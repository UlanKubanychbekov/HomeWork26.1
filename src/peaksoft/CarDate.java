package peaksoft;

import java.time.LocalDate;

public class CarDate {
    private LocalDate yearMadeIn;
    private String model;
    private int price;
    private String colour;

    public CarDate() {

    }

    public CarDate(LocalDate yearMadeIn, String model, int price, String colour) {
        this.yearMadeIn = yearMadeIn;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public LocalDate getYearMadeIn() {
        return yearMadeIn;
    }

    public void setYearMadeIn(LocalDate yearMadeIn) {
        this.yearMadeIn = yearMadeIn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                ", yearMadeIn:" + yearMadeIn +
                ", model: " + model +
                ", price: " + price +
                ", colour: " + colour ;
    }
}
