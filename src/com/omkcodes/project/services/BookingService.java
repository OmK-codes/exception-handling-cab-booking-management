package com.omkcodes.project.services;

import com.omkcodes.project.model.Booking;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookingService {

    private final HashMap<String, Booking> bookingList = new HashMap<>();
    private final Scanner is = new Scanner(System.in);

    void displayBookingDetails(Booking booking) {
        if (booking != null) {
            System.out.println(booking);
        } else {
            System.out.println("Booking details are not available.");
        }
    }

    public Booking createNewBooking() {
        Booking booking = new Booking();
        try {
            System.out.println("Please Enter Booking ID:");
            String bookingId = is.nextLine();

            System.out.println("Enter Passenger ID:");
            String passengerId = is.nextLine();

            System.out.println("Enter Passenger Name:");
            String passengerName = is.nextLine();

            System.out.println("Enter Driver ID:");
            String driverId = is.nextLine();

            System.out.println("Enter Driver Name:");
            String driverName = is.nextLine();

            System.out.println("Enter Vehicle ID:");
            String vehicleId = is.nextLine();

            System.out.println("Enter Pickup Location:");
            String pickupLocation = is.nextLine();

            System.out.println("Enter Drop Location:");
            String dropLocation = is.nextLine();

            System.out.println("Enter Fare:");
            double fare = Double.parseDouble(is.nextLine());

            System.out.println("Enter Distance:");
            double distance = Double.parseDouble(is.nextLine());

            booking.setBookingId(bookingId);
            booking.setPassengerId(passengerId);
            booking.setPassengerName(passengerName);
            booking.setDriverId(driverId);
            booking.setDriverName(driverName);
            booking.setVehicleId(vehicleId);
            booking.setPickupLocation(pickupLocation);
            booking.setDropLocation(dropLocation);
            booking.setFare(fare);
            booking.setDistance(distance);

            if (bookingList.containsKey(bookingId)) {
                System.out.println("Warning: Booking ID already exists. Overwriting the booking.");
            }
            bookingList.put(bookingId, booking);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input! Please enter a valid numeric value for fare or distance.");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please ensure all inputs are correct.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        return booking;
    }

    public void showAllBookings() {
        if (bookingList.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        try {
            for (Booking booking : bookingList.values()) {
                System.out.println("Booking Information: " + booking);
            }
        } catch (Exception e) {
            System.err.println("An error occurred while displaying bookings: " + e.getMessage());
        }
    }

    public HashMap<String, Booking> getBookingList() {
        return bookingList;
    }
}
