package com.example.AirLineReservation.alrmapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AirLineReservation.alrmodel.FlightBooking;

public class FlightBookingMapper implements RowMapper<FlightBooking>{

	@Override
	public FlightBooking mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlightBooking fb=new FlightBooking();
		
		String fid=rs.getString("flightId");
		String fname=rs.getString("flightName");
		String name=rs.getString("name");
		String email=rs.getString("email");
		Date dob=rs.getDate("dob");
		String nationality=rs.getString("nationality");
		String mobile=rs.getString("mobile");
		String addr=rs.getString("address");
		String bookingId=rs.getString("booking_id");
		String seatNumber=rs.getString("seat_no");
		String pnr=rs.getString("pnr_number");
		int seatAvail=rs.getInt("seat");
		
		fb.setFid(fid);
		fb.setFname(fname);
		fb.setName(name);
		fb.setEmail(email);
		fb.setDob(dob);
		fb.setNationality(nationality);
		fb.setMobile(mobile);
		fb.setAddr(addr);
		fb.setBookingId(bookingId);
		fb.setSeatNumber(seatNumber);
		fb.setPnr(pnr);
		fb.setSeatAvail(seatAvail);
		
		
		return fb;
	}

}
