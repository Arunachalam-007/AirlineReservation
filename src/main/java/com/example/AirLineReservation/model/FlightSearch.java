package com.example.AirLineReservation.model;

public class FlightSearch {

	private String from_place;
	private String to_place;
	private String booking_date;

	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public String getTo_place() {
		return to_place;
	}
	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}
	public String getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}
	@Override
	public String toString() {
		return "FlightSearch [from_place=" + from_place + ", to_place=" + to_place + ", booking_date="
				+ booking_date + "]";
	}
	
	
	
	
}
