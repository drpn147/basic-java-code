package com.model.app;

public class FlightDetails {
	private String flightName;
	private String flightSource;
	private String flightDestination;
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public FlightDetails(String flightSource, String flightDestination,String flightName) {
		super();
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
	}
}
