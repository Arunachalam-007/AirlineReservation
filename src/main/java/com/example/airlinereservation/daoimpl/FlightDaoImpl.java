package com.example.airlinereservation.daoimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.airlinereservation.dao.FlightDao;
import com.example.airlinereservation.mapper.FlightBookingMapper;
import com.example.airlinereservation.mapper.FlightMapper;
import com.example.airlinereservation.mapper.PassengerMapper;
import com.example.airlinereservation.model.Flight;
import com.example.airlinereservation.model.FlightBooking;
import com.example.airlinereservation.model.FlightSearch;
import com.example.airlinereservation.model.Passenger;

@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	JdbcTemplate jdbctemp;

	List<Flight> flightData;
	int k;

	List<FlightBooking> flightBookingData;
	
	List<Passenger> passengerData;

	public void addFlight(Flight f) {
		String insertQuery = "insert into alrflightadmin(flightId,flightName,departure,arrival,from_place,to_place,price,seat,start_time,end_time) values(?,?,?,?,?,?,?,?,?,?)";
		Object[] values = { f.getFlightId(), f.getFlightName(), f.getDeparture(), f.getArrival(), f.getFromPlace(),
				f.getToPlace(), f.getPrice(), f.getSeat(), f.getStartTime(), f.getEndTime() };
		jdbctemp.update(insertQuery, values);
	}

	public void searchFlight(FlightSearch flightSearch) {

		String insertQuery = "insert into alrsearchflight(from_place,to_place,booking_date) values(?,?,?)";
		Object[] values = { flightSearch.getFromPlace(), flightSearch.getToPlace(), flightSearch.getBookingDate() };
		jdbctemp.update(insertQuery, values);
	}

	public List<Flight> flightsDisplay(String fromPlace, String departure) {
		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin where from_place=? and departure=?";
		Object[] values = { fromPlace, departure };
		flightData = jdbctemp.query(selectQuery, new FlightMapper(), values);
		return flightData;
	}

	public List<Flight> ticketBooking(String flightId) {

		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin where flightId=?";
		Object[] values = { flightId };
		flightData = jdbctemp.query(selectQuery, new FlightMapper(), values);
		return flightData;

	}

	public void bookingFlight(FlightBooking fb, String cls) {
		String insertQuery = "insert into flightbooking(flightId,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,flightName,uname,booking_date,booking_from_place) values(?,?,?,?,?,?,?,flight_seat_val.nextval,flight_booking_val.nextval,flight_pnr_val.nextval,?,?,?,?,?,?,?)";
		Object[] values = { fb.getFid(), fb.getName(), fb.getEmail(), fb.getDob(), fb.getNationality(), fb.getMobile(),
				fb.getAddress(), fb.getBookingPrice(), fb.getBookingClass(), fb.getSeatAvailability(), fb.getFname(),
				fb.getUserName(), fb.getBookingDate(), fb.getBookingFromPlace() };

		jdbctemp.update(insertQuery, values);

	}

	public int seatAvailCheck(String id, String cls) {
		int seatAvl = 40;
		int result;
		String selectQuery = "select seat from alrflightadmin where flightId=?";
		Object[] values = { id };
		result = jdbctemp.queryForObject(selectQuery, int.class, values);
		if (result == 40) {
			return seatAvl;
		}

		else {
			String selectMinquery = "select min(seat) from flightbooking where flightId=? group by flightId";
			Object[] values2 = { id };
			k = jdbctemp.queryForObject(selectMinquery, int.class, values2);
			return k;
		}

	}

	public void seatCountDecrease(String id, String cls) {
		String updateQuery = "update flightbooking set seat=seat-1 where flightId=?";
		Object[] values1 = { id };
		jdbctemp.update(updateQuery, values1);

		String updateAdminQuery2 = "update alrflightadmin set seat=seat-1 where flightId=?";
		Object[] values2 = { id };
		jdbctemp.update(updateAdminQuery2, values2);

	}

	public List<FlightBooking> flightInfoAdmin() {
		String selectQuery = "select flightId,flightName,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,uname,booking_date,booking_from_place from flightbooking";
		flightBookingData = jdbctemp.query(selectQuery, new FlightBookingMapper());
		return flightBookingData;
	}

	public List<FlightBooking> confirmPasengerInfo(String name, Date dob) {
		String selectQuery = "select distinct flightId,flightName,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,uname,booking_date,booking_from_place from flightbooking where name=? and dob=? ";
		Object[] values2 = { name, dob };
		flightBookingData = jdbctemp.query(selectQuery, new FlightBookingMapper(), values2);
		return flightBookingData;
	}

	public List<FlightBooking> passengerBookedTicket(String uname) {
		String selectQuery = "select flightId,flightName,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,uname,booking_date,booking_from_place from flightbooking where uname=?";
		Object[] values2 = { uname };
		flightBookingData = jdbctemp.query(selectQuery, new FlightBookingMapper(), values2);
		return flightBookingData;
	}

	public void cancelTicket(String bookingid, String flightId) {
		String deleteQuery1 = "delete from flightbooking where booking_id=?";
		Object[] values1 = { bookingid };
		jdbctemp.update(deleteQuery1, values1);

		String updatebookingQuery2 = "update flightbooking set seat=seat+1 where flightId=? and seat<40";
		Object[] values3 = { flightId };
		jdbctemp.update(updatebookingQuery2, values3);

		String updateAdminQuery3 = "update alrflightadmin set seat=seat+1 where flightId=? and seat<40";
		Object[] values2 = { flightId };
		jdbctemp.update(updateAdminQuery3, values2);

	}

	public List<Passenger> passengerInfo() {
		String selectQuery = "select name,mobile,email,username,dob,address from alrpassenger";
		passengerData = jdbctemp.query(selectQuery, new PassengerMapper());
		return passengerData;

	}

	public void deletePassenger(String username) {
		String deleteQuery1 = "delete from alrpassenger where username=?";
		Object[] values1 = { username };
		jdbctemp.update(deleteQuery1, values1);

	}

	public List<Flight> viewFlight() {
		String selectQuery = "select flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time,seat from alrflightadmin";
		flightData = jdbctemp.query(selectQuery, new FlightMapper());
		return flightData;
	}

	public void deleteFlight(String flightId) {
		String deleteQuery = "delete from alrflightadmin where flightId=?";
		Object[] values = { flightId };
		jdbctemp.update(deleteQuery, values);

	}


}
