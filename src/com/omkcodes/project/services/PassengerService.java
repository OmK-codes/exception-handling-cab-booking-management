package com.omkcodes.project.services;

import com.omkcodes.project.model.Passenger;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PassengerService {

    // Declare a HashMap to hold Passenger objects
    private final HashMap<String, Passenger> passengerList = new HashMap<>();

    // Declare a Scanner object to take user input from the console
    private final Scanner is = new Scanner(System.in);

    /**
     * This method prints the details of a single Passenger object.
     * It accepts a Passenger object as an argument and prints it.
     * @param passenger the Passenger object to be printed.
     */
    void displayPassengerDetails(Passenger passenger) {
        if (passenger != null) {
            System.out.println(passenger);
        } else {
            System.out.println("Passenger details are not available.");
        }
    }

    /**
     * This method is responsible for creating a new Passenger object.
     * It prompts the user to enter the passenger's details such as ID, name, email, phone number, and address.
     * After collecting the inputs, it sets the values to the Passenger object and returns it.
     * @return the newly created Passenger object.
     */
    public Passenger createNewPassenger() {
        Passenger passenger = new Passenger();
        try {
            // Ask for and capture passenger ID (converting the input to an integer)
            System.out.println("Please Enter Passenger ID :");
            int passengerId = Integer.parseInt(is.nextLine());

            // Ask for and capture passenger's full name
            System.out.println("Enter your full Name:");
            String passengerName = is.nextLine();

            // Ask for and capture passenger's email
            System.out.println("Enter your email:");
            String email = is.nextLine();

            // Ask for and capture phone number (converting the input to an integer)
            System.out.println("Enter your Phone Number :");
            int phoneNumber = Integer.parseInt(is.nextLine());

            // Ask for and capture passenger's address
            System.out.println("Enter your Address :");
            String passengerAddress = is.nextLine();

            // Set the values for the Passenger object using setter methods
            passenger.setPassengerId(String.valueOf(passengerId));  // Store passengerId as a String
            passenger.setPassengerName(passengerName);
            passenger.setEmail(email);
            passenger.setPhone(phoneNumber);
            passenger.setAddress(passengerAddress);

            // Adding the new passenger to the list
            passengerList.put(passenger.getPassengerId(), passenger);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter a valid numeric value for passenger ID and phone number.");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please ensure all inputs are correct.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        return passenger;
    }

    /**
     * This method iterates over the list of passengers and displays their details.
     * It loops through the passengerList and prints each passenger's information.
     */
    public void showAllPassengers() {
        if (passengerList.isEmpty()) {
            System.out.println("No passengers available.");
            return;
        }
        try {
            for (Passenger passenger : passengerList.values()) {
                System.out.println("Passenger Information: " + passenger);
            }
        } catch (Exception e) {
            System.err.println("An error occurred while displaying passengers: " + e.getMessage());
        }
    }

    // Getter for passenger list
    public HashMap<String, Passenger> getPassengerList() {
        return passengerList;
    }
}
