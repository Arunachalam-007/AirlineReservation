package com.example.AirLineReservation.alrmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.alrmodel.Flight;
import com.example.AirLineReservation.alrmodel.Passenger;

public class FlightMapper implements RowMapper<Flight> {

	@Override
	public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {

		Flight f = new Flight();

		String fid = rs.getString("flightId");
		String fname = rs.getString("flightName");
		String departure = rs.getString("departure");
		String arrival = rs.getString("arrival");
		String from_place = rs.getString("from_place");
		String to_place = rs.getString("to_place");
		String price = rs.getString("price");

		
		f.setFid(fid);
		f.setFname(fname);
		f.setDeparture(departure);
		f.setArrival(arrival);
		f.setFrom_place(from_place);
		f.setTo_place(to_place);
		f.setPrice(price);
		
		return f;
	}
}