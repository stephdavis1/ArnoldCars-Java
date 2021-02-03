package Vehicles;

import VehicleParts.Engine;

public abstract class Vehicle {

    private String colour;
    private int price;

    private Engine engine;

    public Vehicle (String colour, int price, Engine engine){
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
