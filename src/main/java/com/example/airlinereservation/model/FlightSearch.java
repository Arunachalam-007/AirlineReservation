package com.example.airlinereservation.model;

public class FlightSearch {

	private String fromPlace;
	private String toPlace;
	private String bookingDate;
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "FlightSearch [fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", bookingDate=" + bookingDate + "]";
	}

	}
	
	
	

