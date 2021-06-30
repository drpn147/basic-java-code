package com.service.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.app.FlightDetails;
import com.model.app.PassengersDetails;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}

}

public class FlightService {
	List<FlightDetails> flights;
	List<PassengersDetails> passengers;

	public FlightService() {
		flights = new ArrayList<FlightDetails>();
		passengers = new ArrayList<PassengersDetails>();

	}

	static Scanner scan = new Scanner(System.in);

	public void setFlightDetails() {
		
		System.out.println("Enter the source");
		String flightSource = scan.nextLine();
		System.out.println("Enter the destination");
		String flightDestination = scan.nextLine();
		String flightName = "";
		System.out.println("Enter the Flight Name");
		String tempFlightName = scan.nextLine();
		if (flights.isEmpty()) {

			flightName = tempFlightName;
		} else if (checkDuplicateFlightName(tempFlightName, flightSource, flightDestination)) {
			System.out.println("Already Present");
			return;
		} else {
			flightName = tempFlightName;
		}
		FlightDetails flight = new FlightDetails(flightSource, flightDestination, flightName);
		flights.add(flight);
	}

	private boolean checkDuplicateFlightName(String tempFlightName, String flightSource, String flightDestination) {

		for (int i = 0; i < flights.size(); i++) {
			String flightName = flights.get(i).getFlightName();
			if (flightName.equals(tempFlightName) && (flights.get(i).getFlightSource().equals(flightSource))
					&& (flights.get(i).getFlightDestination().equals(flightDestination))) {
				return true;
			}
		}
		return false;
	}

	public void displayFlight(String flightSource, String flightDestination) {
		if (flights.isEmpty()) {
			System.out.println("No Flights Available");
		} else {
			System.out.println("Available Flights");
			for (int i = 0; i < flights.size(); i++) {
				if ((flights.get(i).getFlightSource().equals(flightSource))
						&& (flights.get(i).getFlightDestination().equals(flightDestination))) {
					System.out.println(flights.get(i).getFlightName());
				}
			}
		}

	}

	public boolean bookFlight(String flightName) {
		if (!flights.isEmpty()) {
			for (int i = 0; i < flights.size(); i++) {
				if (flights.get(i).getFlightName().equals(flightName)) {
					setPassengersDetails(flightName);
					return true;
				}
			}
		}
		return false;
	}

	private void setPassengersDetails(String flightName) {
		System.out.println("Enter the Passenger FirstName");
		String passengerFirstName = scan.nextLine();
		System.out.println("Enter the Passenger LastName");
		String passengerLastName = scan.nextLine();
		System.out.println("Enter the Passenger Age");
		byte passengerAge = scan.nextByte();
		System.out.println("Enter the Passenger Gender");
		String passengerGender = passengersGender();
		PassengersDetails passenger = new PassengersDetails(passengerFirstName, passengerLastName, passengerAge,
				passengerGender, flightName);
		passengers.add(passenger);

	}

	private String passengersGender() {
		byte choice;
		do {
			System.out.println("---------------------------------------------");
			System.out.println("1. Male");
			System.out.println("2. Female");
			System.out.println("---------------------------------------------");
			choice = scan.nextByte();
			switch (choice) {
			case 1:
				return "Male";
			case 2:
				return "Female";
			default:
				System.out.println("Please choose correct department");
			}
		} while (choice != 0);
		return null;
	}

	public void searchPassenger(String flightSource1, String flightDestination1) {
		String flightName = null;
		System.out.println("---------------------------------------------");
		if (flights.isEmpty()) {
			System.out.println("No Flights Available");
		} else {

			for (int i = 0; i < flights.size(); i++) {

				if (flights.get(i).getFlightSource().equals(flightSource1)
						&& flights.get(i).getFlightDestination().equals(flightDestination1)) {
					flightName = flights.get(i).getFlightName();
					checkPassenger(flightName);
					break;
				}
			}
		}
		try {
			if (flightName == null) {
				throw new MyException("No such source and destination found");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------------------------");

	}

	private void checkPassenger(String flightName) {

		if (passengers.isEmpty()) {
			System.out.println("No Passengers Details");
		} else {
			for (int i = 0; i < passengers.size(); i++) {
				String passengerFirstName = passengers.get(i).getPassengerFirstName();
				String passegnerLastName = passengers.get(i).getPassengerLastName();
				String passegnerFlightName = passengers.get(i).getPassengerFlightName();
				if (flightName.equals(passegnerFlightName)) {
					System.out.println("Passenger Name: " + passegnerLastName.charAt(0) + ". " + passengerFirstName);
				}
			}
		}
	}

}
