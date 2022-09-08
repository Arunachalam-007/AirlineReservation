package com.example.AirLineReservation.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AirLineReservation.dao.FlightDao;
import com.example.AirLineReservation.mapper.FlightBookingMapper;
import com.example.AirLineReservation.mapper.FlightMapper;
import com.example.AirLineReservation.model.Flight;
import com.example.AirLineReservation.model.FlightBooking;
import com.example.AirLineReservation.model.FlightSearch;

@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	JdbcTemplate jdbctemp;

	public void addFlight(Flight f) {
		String insertQuery = "insert into alrflightadmin(flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat) values(?,?,?,?,?,?,?,?,?,?)";
		Object[] values = { f.getFlightId(), f.getFlightName(), f.getDeparture(), f.getArrival(), f.getFrom_place(),
				f.getTo_place(), f.getPrice(), f.getStart_time(), f.getEnd_time(),f.getSeat() };
		int i = jdbctemp.update(insertQuery, values);
	}

	public void searchFlight(FlightSearch flightSearch) {

		String insertQuery = "insert into alrsearchflight(from_place,to_place,booking_date) values(?,?,?)";
		Object[] values = { flightSearch.getFrom_place(), flightSearch.getTo_place(), flightSearch.getBooking_date() };
		int i = jdbctemp.update(insertQuery, values);
	}

	public List<Flight> flightDisplay(String from_place, String departure) {
		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin where from_place=? and departure=?";
		Object[] values = { from_place, departure };
		List<Flight> data = jdbctemp.query(selectQuery, new FlightMapper(), values);
		return data;
	}

	public List<Flight> flightDisplayInfo(String from_place, String departure) {
		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin where from_place=? and departure=?";
		Object[] values = { from_place, departure };
		List<Flight> data = jdbctemp.query(selectQuery, new FlightMapper(), values);
		return data;
	}

	public List<Flight> ticketBooking(String flightId) {

		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin where flightId=?";
		Object[] values = { flightId };
		List<Flight> data = jdbctemp.query(selectQuery, new FlightMapper(), values);
		return data;

	}


	public void bookingFlight(FlightBooking fb, String cls) {
		String insertQuery = "insert into flightbooking(flightId,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,flightName,uname) values(?,?,?,?,?,?,?,flight_seat_val.nextval,flight_booking_val.nextval,flight_pnr_val.nextval,?,?,?,?,?)";
		Object[] values = { fb.getFid(), fb.getName(), fb.getEmail(), fb.getDob(), fb.getNationality(), fb.getMobile(),
				fb.getAddress(), fb.getBookingPrice(), fb.getBookingClass(), fb.getSeatAvailability(), fb.getFname(),fb.getUserName() };

		int i = jdbctemp.update(insertQuery, values);
		System.out.println(i);
	}

	public int seatAvailCheck(String id, String cls) {
		int SEAT_AVL=40;
		int result;
		String selectQuery="select seat from alrflightadmin where flightId=?";
		Object[] values= {id};
		result= jdbctemp.queryForObject(selectQuery, int.class, values);
		if(result==40) {
			return SEAT_AVL;
		}
		else {
			String selectMinquery="select min(seat) from flightbooking where flightId=? and class=? group by flightId";
//			String selectMinquery="select min(seat) from flightbooking where flightId=? and class=? group by flightId";
			Object[] values2 = { id,cls };
			int k = jdbctemp.queryForObject(selectMinquery, int.class, values2);
			return k;
		}
		
		}

	public void seatCountDecrease(String id, String cls) {
		String updateQuery = "update flightbooking set seat=seat-1 where class=? and flightId=?";
		Object[] values1 = { cls, id };
		int j = jdbctemp.update(updateQuery, values1);
		System.out.println(j);
		
		String updateAdminQuery2="update alrflightadmin set seat=seat-1 where flightId=?";
		Object[] values2 = { id };
		int k = jdbctemp.update(updateAdminQuery2, values2);
		System.out.println(k);
	}

	public List<FlightBooking> flightInfoAdmin() {
		String selectQuery = "select flightId,flightName,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,uname from flightbooking";
		List<FlightBooking> data = jdbctemp.query(selectQuery, new FlightBookingMapper());
		return data;
	}
	public List<FlightBooking> passengerBookedTicket(String uname){
		String selectQuery="select flightId,flightName,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,uname from flightbooking where uname=?";
		Object[] values2 = { uname };
		List<FlightBooking> data = jdbctemp.query(selectQuery, new FlightBookingMapper(),values2);
		return data;
	}
	
	public void cancelTicket(String bookingid) {
		String deleteQuery1 = "delete from flightbooking where booking_id=?";
		Object[] values1 = {bookingid};
		int j = jdbctemp.update(deleteQuery1, values1);
		System.out.println(j);	
	}


}
