package com.example.AirLineReservation.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.model.Flight;

public class FlightMapper implements RowMapper<Flight> {

	@Override
	public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

		Flight f = new Flight();

		String flightid = rs.getString("flightId");
		String flightName = rs.getString("flightName");
		String departure = rs.getString("departure");
		String arrival = rs.getString("arrival");
		String from_place = rs.getString("from_place");
		String to_place = rs.getString("to_place");
		String price = rs.getString("price");
		String start_time=rs.getString("start_time");
		String end_time=rs.getString("end_time");
		int seat=rs.getInt("seat");

		
		f.setFlightId(flightid);
		f.setFlightName(flightName);
		f.setDeparture(departure);
		f.setArrival(arrival);
		f.setFrom_place(from_place);
		f.setTo_place(to_place);
		f.setPrice(price);
		f.setStart_time(start_time);
		f.setEnd_time(end_time);
		f.setSeat(seat);
		
		
		return f;
	}
}