package com.example.AirLineReservation.dao;

import java.util.List;

import com.example.AirLineReservation.model.Flight;
import com.example.AirLineReservation.model.FlightBooking;
import com.example.AirLineReservation.model.FlightSearch;

public interface FlightDao {
	public void addFlight(Flight f);

	public void searchFlight(FlightSearch fs);

	public List<Flight> flightDisplay(String from_flace, String departure);

	public List<Flight> flightDisplayInfo(String from_flace, String departure);

	public List<Flight> ticketBooking(String id);

	public void bookingFlight(FlightBooking fb, String cls);

	public int seatAvailCheck(String id, String cls);

	public void seatCountDecrease(String id, String cls);

	public List<FlightBooking> flightInfoAdmin();

	public List<FlightBooking> passengerBookedTicket(String uname);

	public void cancelTicket(String bookingid,String flightId);

}
