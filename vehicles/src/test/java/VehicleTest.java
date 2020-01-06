package test.java;


import main.java.Car;
import main.java.Train;
import main.java.Vehicle;
import org.junit.AfterClass;
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
    private static final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterClass
    public static void returnOutStreamToOriginal() {
        System.setOut(originalOut);
    }

    @Test
    public void printVehicleDetails_vehiclesArrayIsNull_noPrintings() {
        ArrayList<Vehicle> vehicles = null;
        Vehicle.printVehicleDetails(vehicles);
        assertEquals("", outContent.toString());
    }

    @Test
    public void printVehicleDetails_vehiclesArrayIsEmpty_noPrintings() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle.printVehicleDetails(vehicles);
        assertEquals("", outContent.toString());
    }

    @Test
    public void printVehicleDetails_carsAndTrains_printingsAsExpected() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(1, "BMW"));
        vehicles.add(new Train(2, 6));
        vehicles.add(new Car(3, "Fiat"));
        vehicles.add(new Train(4, 5));

        Vehicle.printVehicleDetails(vehicles);
        assertEquals("Car Id: 1, Car type: BMW\n" +
                     "Train Id: 2, Number of train cars: 6\n" +
                     "Car Id: 3, Car type: Fiat\n" +
                     "Train Id: 4, Number of train cars: 5\n", outContent.toString());
    }


}
