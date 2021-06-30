package com.client.app;


import java.util.Scanner;

import com.service.app.FlightService;


public class FlightApp {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		FlightService flightService=new FlightService();
		byte choice;
		do {
			System.out.println("---------------------------------------------");
			System.out.println("--------------------MENU---------------------");
			System.out.println("1. Create Flight");
			System.out.println("2. Display Flights");
			System.out.println("3. Book Ticket Passenger");
			System.out.println("4. Corresponding passenger details");
			System.out.println("5. Exit");
			System.out.println("---------------------------------------------");
			choice = scan.nextByte();
			switch (choice) {
			case 1:
				flightService.setFlightDetails();
				break;
			case 2:
				System.out.println("Enter the Flight Source");
				scan.nextLine();
				String flightSource = scan.nextLine();
				System.out.println("Enter the Flight Destination");
				String flightDestination = scan.nextLine();
				flightService.displayFlight(flightSource, flightDestination);
				break;
			case 3:
				scan.nextLine();
				System.out.println("Enter the Flight Name to Book");
				String flightName = scan.nextLine();
				boolean result = flightService.bookFlight(flightName);
				if (result) {
					System.out.println("Booked Successfully");
				} else {
					System.out.println("Failed to Booked");
				}
				break;
			case 4:
				scan.nextLine();
				System.out.println("Enter the Flight Source");
				String flightSource1 = scan.nextLine();
				System.out.println("Enter the Flight Destination");
				String flightDestination1 = scan.nextLine();
				flightService.searchPassenger(flightSource1, flightDestination1);

				break;
			case 5:
				System.out.println("Exited Successfully");
				return;
			default:
				System.out.println("Please enter the valid option");
			}
		} while (choice != 0);

	}

}
