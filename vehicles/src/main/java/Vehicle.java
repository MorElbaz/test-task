package main.java;

import java.util.ArrayList;

public abstract class Vehicle {
    private long Id;

    public Vehicle(long id) {
        Id = id;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public abstract void printDetails();

    public static void printVehicleDetails(ArrayList<Vehicle> vehicles) {
        if (vehicles != null) {
            for (Vehicle vehicle : vehicles) {
                vehicle.printDetails();
            }
        }
    }
}
