import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getMoney(){
        return this.money;
    }

    public ArrayList getOwnedVehicles(){
        return this.ownedVehicles;
    }

}
