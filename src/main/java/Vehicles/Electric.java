package Vehicles;

import VehicleParts.Engine;

public class Electric extends Vehicle {

    private int batteryLevelPercentage;

    public Electric (String colour, int price, Engine engine, int batteryLevelPercentage){
        super(colour, price, engine);
        this.batteryLevelPercentage = batteryLevelPercentage;
    }

    public int getBatteryLevelPercentage() {
        return batteryLevelPercentage;
    }
}

