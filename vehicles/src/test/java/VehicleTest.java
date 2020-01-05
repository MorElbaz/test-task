package test.java;


import main.java.Car;
import main.java.Train;
import main.java.Vehicle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class VehicleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Vehicle vehicle = new Vehicle(4);

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void afterTest() {
        System.setOut(originalOut);
    }

    @Test
    public void printVehicleDetails_vehiclesArrayIsNull_noPrintings() {
        ArrayList<Vehicle> vehicles = null;
        vehicle.printVehicleDetails(vehicles);
        assertEquals("", outContent.toString());
    }

    @Test
    public void printVehicleDetails_carsAndTrains_printingsAsExpected() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(1, "BMW"));
        vehicles.add(new Train(2, 6));
        vehicles.add(new Car(3, "Fiat"));
        vehicles.add(new Train(4, 5));

        vehicle.printVehicleDetails(vehicles);
        assertEquals("", outContent.toString());
    }

    @Test
    public void printVehicleDetails_vehiclesArrayIsEmpty_noPrintings() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicle.printVehicleDetails(vehicles);
        assertEquals("", outContent.toString());
    }


}
