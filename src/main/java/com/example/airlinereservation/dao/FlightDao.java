package com.example.airlinereservation.dao;

import java.util.List;

import com.example.airlinereservation.model.Flight;
import com.example.airlinereservation.model.FlightBooking;
import com.example.airlinereservation.model.FlightSearch;

public interface FlightDao {
	void addFlight(Flight f);

	void searchFlight(FlightSearch fs);

	List<Flight> flightsDisplay(String fromPlace, String departure);

	List<Flight> flightDisplayInfo(String fromPlace, String departure);

	List<Flight> ticketBooking(String id);

	void bookingFlight(FlightBooking fb, String cls);

	int seatAvailCheck(String id, String cls);

	void seatCountDecrease(String id, String cls);

	List<FlightBooking> flightInfoAdmin();

	List<FlightBooking> passengerBookedTicket(String uname);

	void cancelTicket(String bookingid,String flightId);

}
