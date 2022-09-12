package com.example.airlinereservation.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.airlinereservation.model.Flight;

public class FlightMapper implements RowMapper<Flight> {

	@Override
	public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

		Flight f = new Flight();

		String flightid = rs.getString("flightId");
		String flightName = rs.getString("flightName");
		String departure = rs.getString("departure");
		String arrival = rs.getString("arrival");
		String fromPlace = rs.getString("from_place");
		String toPlace = rs.getString("to_place");
		String price = rs.getString("price");
		String startTime=rs.getString("start_time");
		String endTime=rs.getString("end_time");
		int seat=rs.getInt("seat");

		
		f.setFlightId(flightid);
		f.setFlightName(flightName);
		f.setDeparture(departure);
		f.setArrival(arrival);
		f.setFromPlace(fromPlace);
		f.setToPlace(toPlace);
		f.setPrice(price);
		f.setStartTime(startTime);
		f.setEndTime(endTime);
		f.setSeat(seat);
		
		
		return f;
	}
}