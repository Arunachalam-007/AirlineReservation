package com.example.AirLineReservation.dto;


public class FlightDTO {
	private String flightId;
	private String FlightName;
	private String flightDeparture;
	private String start_time;
	private String end_time;
	private int flightSeat;
	public int getFlightSeat() {
		return flightSeat;
	}
	public void setFlightSeat(int flightSeat) {
		this.flightSeat = flightSeat;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
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
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", flightSeat=" + flightSeat
				+ ", flightArrival=" + flightArrival + ", flightFromPlace=" + flightFromPlace + ", flightToPlace="
				+ flightToPlace + ", Price=" + Price + "]";
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
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	private String Price;
	


}
