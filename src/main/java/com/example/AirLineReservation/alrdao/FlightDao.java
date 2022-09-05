package com.example.AirLineReservation.alrdao;

import com.example.AirLineReservation.alrmodel.Flight;
import com.example.AirLineReservation.alrmodel.FlightSearch;

public interface FlightDao {
	public void addFlight(Flight f);
	public void searchFlight(FlightSearch fs);

}
