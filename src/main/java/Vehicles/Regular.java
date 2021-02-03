package Vehicles;

import VehicleParts.Engine;

public class Regular extends Vehicle {

    private String fuelType;
    private int fuelLevelPercentage;

    public Regular(String colour, int price, Engine engine, String fuelType, int fuelLevelPercentage) {
        super(colour, price, engine);
        this.fuelType = fuelType;
        this.fuelLevelPercentage = fuelLevelPercentage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelLevel() {
        return fuelLevelPercentage;
    }
}
