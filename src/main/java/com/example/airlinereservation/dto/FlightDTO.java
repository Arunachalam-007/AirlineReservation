package com.example.airlinereservation.dto;


public class FlightDTO {
	private String flightId;
	private String FlightName;
	private String flightDeparture;
	private String startTime;
	private String endTime;
	private int flightSeat;
	public int getFlightSeat() {
		return flightSeat;
	}
	public void setFlightSeat(int flightSeat) {
		this.flightSeat = flightSeat;
	}
	
	private String flightArrival;
	private String flightFromPlace;
	private String flightToPlace;
	public String getFlightFromPlace() {
		return flightFromPlace;
	}
	public void setFlightFromPlace(String flightFromPlace) {
		this.flightFromPlace = flightFromPlace;
	}
	public String getFlightToPlace() {
		return flightToPlace;
	}
	public void setFlightToPlace(String flightToPlace) {
		this.flightToPlace = flightToPlace;
	}
	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", FlightName=" + FlightName + ", flightDeparture=" + flightDeparture
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", flightSeat=" + flightSeat
				+ ", flightArrival=" + flightArrival + ", flightFromPlace=" + flightFromPlace + ", flightToPlace="
				+ flightToPlace + ", price=" + price + "]";
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public String getFlightDeparture() {
		return flightDeparture;
	}
	public void setFlightDeparture(String flightDeparture) {
		this.flightDeparture = flightDeparture;
	}
	public String getFlightArrival() {
		return flightArrival;
	}
	public void setFlightArrival(String arrival) {
		this.flightArrival = arrival;
	}
	
	private String price;
	


}
