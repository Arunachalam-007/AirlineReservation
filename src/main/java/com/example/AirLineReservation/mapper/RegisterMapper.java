package com.example.AirLineReservation.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.model.Passenger;



public class RegisterMapper implements RowMapper<Passenger>{

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passenger p=new Passenger();
		
//		String name=rs.getString("name");
//		String addr=rs.getString("address");
//		String mobile=rs.getString("mobile");
//		String email=rs.getString("email");
		String uname=rs.getString("username");
//		String pwd=rs.getString("pssword");
//		String dob=rs.getString("dob");
		
//		p.setName(name);
//		p.setAddr(addr);
//		p.setMobile(mobile);
//		p.setEmail(email);
		p.setUname(uname);
//		p.setPassword(pwd);
		
		
		
//		LocalDate dob1 = LocalDate.parse(dob);
//        Date date = Date.valueOf(dob1);
//		p.setDob(date);
////		l.setCid(cid);
////		l.setCname(cName);
////		return l;
		return p;
	}

}
