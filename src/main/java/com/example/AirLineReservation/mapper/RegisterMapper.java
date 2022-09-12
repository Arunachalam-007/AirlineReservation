package com.example.AirLineReservation.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.model.Passenger;



public class RegisterMapper implements RowMapper<Passenger>{

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passenger p=new Passenger();
		

		String uname=rs.getString("username");

		p.setUname(uname);
		
		
	
		return p;
	}

}
