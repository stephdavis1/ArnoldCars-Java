import Behaviours.ICarDeal;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements ICarDeal {

    private String name;
    private ArrayList<Vehicle> stock;
    private int till;

    public Dealership(String name, int till){
        this.name = name;
        this.till = till;
        stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getTill(){
        return this.till;
    }

    public ArrayList getStock(){
        return this.stock;
    }

    public void carDeal(Vehicle vehicle, Customer customer){

        //Customer
        int wallet = customer.getMoney(); //Assigning amount of money customer has to variable
        wallet -= vehicle.getPrice(); //Reducing wallet by price of vehicle
        ArrayList ownedCars = customer.getOwnedVehicles(); //Assigning customer owned vehicles to variable
        ownedCars.add(vehicle); //Adding vehicle to customers list of owned vehicles

        //Dealership
        this.till += vehicle.getPrice(); //Adding the price of the vehicle to the till
        stock.remove(vehicle); //Removing vehicle from dealership stock
    }


}
