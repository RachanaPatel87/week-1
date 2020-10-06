import java.util.Arrays;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private int yearOfModel;
    private double price;


    public Car(String make, String model, int yearOfModel, double price) {
        setMake(make);
        setModel(model);
        setYearOfModel(yearOfModel);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    /**
     * This will validate that the argument matches one of the car maker:
     * ->Honda
     * ->Toyota
     * ->Ford
     * @param make - String representing car making company name
     */
    public void setMake(String make) {
        List<String> validMakers = Arrays.asList("Honda","Toyota","Ford");
        if (validMakers.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Valid car making Companies are:"+ validMakers);
    }

    public String getModel() {
        return model;
    }

    /**
     * @param model - String representing car's model name
     */
    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    /**
     * This method sets that the model year should be between 2010 to 2020
     * @param yearOfModel - this integer will represent the year of model
     */
    public void setYearOfModel(int yearOfModel) {
        if (yearOfModel >= 2010 && yearOfModel <= 2020)
            this.yearOfModel = yearOfModel;
        else
            throw new IllegalArgumentException("year of model must be between 2010-2020");
    }

    public double getPrice() {

        return price;
    }

    /**
     * This method sets that the price should be between $20000 to $100000
     * @param price- this will represent the price of car
     */
    public void setPrice(double price) {
        if (price >= 20000 && price <= 100000 )
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be between 20000-100000");
    }

    public String toString(){

        return String.format("%s, holds %d ml and costs $%.2f",make, yearOfModel, price);
    }


}
