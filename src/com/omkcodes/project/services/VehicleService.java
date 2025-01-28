package com.omkcodes.project.services;

import com.omkcodes.project.model.Vehicle;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleService {

    private final HashMap<String, Vehicle> vehicleList = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);

    void displayVehicleDetails(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println(vehicle);
        } else {
            System.out.println("Vehicle details are not available.");
        }
    }

    public Vehicle createNewVehicle() {
        Vehicle vehicle = new Vehicle();
        try {
            System.out.println("Please Enter Vehicle ID :");
            String vehicleId = sc.nextLine();

            System.out.println("Enter the Vehicle Model:");
            String vehicleModel = sc.nextLine();

            System.out.println("Enter the Vehicle Registration Number:");
            String registrationNumber = sc.nextLine();

            System.out.println("Enter the Vehicle Color:");
            String vehicleColor = sc.nextLine();

            System.out.println("Is the vehicle available? (true/false):");
            boolean availability = Boolean.parseBoolean(sc.nextLine());

            System.out.println("Enter the Vehicle Seat Capacity:");
            int seatCapacity = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the Vehicle's Per KM Rate:");
            double perKmRate = Double.parseDouble(sc.nextLine());

            vehicle.setVehicleId(vehicleId);
            vehicle.setModel(vehicleModel);
            vehicle.setRegistrationNumber(registrationNumber);
            vehicle.setColor(vehicleColor);
            vehicle.setAvailable(availability);
            vehicle.setSeatCapacity(seatCapacity);
            vehicle.setPerKmRate(perKmRate);

            vehicleList.put(vehicle.getVehicleId(), vehicle);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter a valid numeric value for seat capacity and per KM rate.");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please ensure all inputs are correct.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        return vehicle;
    }

    public void showAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        try {
            for (Vehicle vehicle : vehicleList.values()) {
                System.out.println("Vehicle Information: " + vehicle);
            }
        } catch (Exception e) {
            System.err.println("An error occurred while displaying vehicles: " + e.getMessage());
        }
    }

    public HashMap<String, Vehicle> getVehicleList() {
        return vehicleList;
    }
}
