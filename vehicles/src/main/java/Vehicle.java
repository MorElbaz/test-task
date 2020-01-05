package main.java;

import java.util.ArrayList;

public class Vehicle {
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

    public void printVehicleDetails(ArrayList<Vehicle> vehicles) {
        if (vehicles != null) {
            for (Vehicle vehicle : vehicles) {
                System.out.println("ID: " + vehicle.getId());

                if (vehicle instanceof Car) {
                    System.out.println("Type: " + ((Car) vehicle).getType());
                }

                if (vehicle instanceof Train) {
                    System.out.println("Number of train cars: " + ((Train) vehicle).getNumOfTrainCars());
                }
            }
        }
    }
}
