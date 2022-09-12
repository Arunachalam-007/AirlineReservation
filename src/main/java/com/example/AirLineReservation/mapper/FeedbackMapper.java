package com.example.AirLineReservation.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.model.Feedback;


public class FeedbackMapper implements RowMapper<Feedback> {

	@Override
	public Feedback mapRow(ResultSet rs, int rowNum) throws SQLException {
		Feedback feedback=new Feedback();
		
		String email=rs.getString("email");
		String city=rs.getString("city");
		String subject=rs.getString("subject");
		
		feedback.setEmail(email);
		feedback.setCity(city);
		feedback.setSubject(subject);
		
		return feedback;
	}

}
