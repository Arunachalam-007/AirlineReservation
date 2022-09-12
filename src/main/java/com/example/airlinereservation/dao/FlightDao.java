package com.example.airlinereservation.dao;

import java.util.List;

import com.example.airlinereservation.model.Flight;
import com.example.airlinereservation.model.FlightBooking;
import com.example.airlinereservation.model.FlightSearch;

public interface FlightDao {
	public void addFlight(Flight f);

	public void searchFlight(FlightSearch fs);

	public List<Flight> flightDisplay(String fromPlace, String departure);

	public List<Flight> flightDisplayInfo(String fromPlace, String departure);

	public List<Flight> ticketBooking(String id);

	public void bookingFlight(FlightBooking fb, String cls);

	public int seatAvailCheck(String id, String cls);

	public void seatCountDecrease(String id, String cls);

	public List<FlightBooking> flightInfoAdmin();

	public List<FlightBooking> passengerBookedTicket(String uname);

	public void cancelTicket(String bookingid,String flightId);

}