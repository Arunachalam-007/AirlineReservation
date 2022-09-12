package com.example.airlinereservation.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.airlinereservation.model.Passenger;



public class PassengerMapper implements RowMapper<Passenger>  {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Passenger p=new Passenger();
		
		String name=rs.getString("name");
		String address=rs.getString("address");
		String mobile=rs.getString("mobile");
		String email=rs.getString("email");
		String uname=rs.getString("username");
		Date dateOfBirth=rs.getDate("dob");
		
		p.setAddress(address);
		p.setName(name);
		p.setMobile(mobile);
		p.setEmail(email);
		p.setUname(uname);
		p.setDateOfBirth(dateOfBirth);
		
		
		
		
		
		return p;
	}

}
