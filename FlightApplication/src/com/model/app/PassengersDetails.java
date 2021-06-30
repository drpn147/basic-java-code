package com.model.app;

public class PassengersDetails {
	private String passengerFirstName;
	private String passengerLastName;
	private byte passengerAge;
	private String passengerGender;
	private String passengerFlightName;
	public PassengersDetails(String passengerFirstName, String passengerLastName, byte passengerAge,
			String passengerGender, String passengerFlightName) {
		super();
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.passengerFlightName = passengerFlightName;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public byte getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(byte passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getPassengerFlightName() {
		return passengerFlightName;
	}
	public void setPassengerFlightName(String passengerFlightName) {
		this.passengerFlightName = passengerFlightName;
	}

}
