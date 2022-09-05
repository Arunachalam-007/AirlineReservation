package com.example.AirLineReservation.alrdto;

public class FlightSearchDTO {
	
	private String searchFromPlace;
	private String searchToPlace;
	private String searchBookingDate;
	@Override
	public String toString() {
		return "FlightSearchDTO [ searchFromPlace=" + searchFromPlace
				+ ", searchToPlace=" + searchToPlace + ", searchBookingDate=" + searchBookingDate + "]";
	}
	
	public String getSearchFromPlace() {
		return searchFromPlace;
	}
	public void setSearchFromPlace(String searchFromPlace) {
		this.searchFromPlace = searchFromPlace;
	}
	public String getSearchToPlace() {
		return searchToPlace;
	}
	public void setSearchToPlace(String searchToPlace) {
		this.searchToPlace = searchToPlace;
	}
	public String getSearchBookingDate() {
		return searchBookingDate;
	}
	public void setSearchBookingDate(String searchBookingDate) {
		this.searchBookingDate = searchBookingDate;
	}
	

}
