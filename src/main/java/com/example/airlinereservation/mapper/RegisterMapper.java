package com.example.airlinereservation.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.airlinereservation.model.Passenger;



public class RegisterMapper implements RowMapper<Passenger>{

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passenger p=new Passenger();
		

		String uname=rs.getString("username");
		String email=rs.getString("email");

		p.setUname(uname);
		p.setEmail(email);
		
		
		
	
		return p;
	}

}
