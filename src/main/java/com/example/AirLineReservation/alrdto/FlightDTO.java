package com.example.AirLineReservation.alrdto;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class FlightDTO {
	private String flightId;
	private String FlightName;
	private String flightDeparture;
//	private String flightDuration;
	private float start_time;
	private float end_time;
	public float getStart_time() {
		return start_time;
	}
	public void setStart_time(float start_time) {
		this.start_time = start_time;
	}
	public float getEnd_time() {
		return end_time;
	}
	public void setEnd_time(float end_time) {
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
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", flightArrival=" + flightArrival
				+ ", flightFromPlace=" + flightFromPlace + ", flightToPlace=" + flightToPlace + ", Price=" + Price
				+ "]";
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
//	public String getFlightDuration() {
//		return flightDuration;
//	}
//	public void setFlightDuration(String flightDuration) {
//		this.flightDuration = flightDuration;
//	}
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
