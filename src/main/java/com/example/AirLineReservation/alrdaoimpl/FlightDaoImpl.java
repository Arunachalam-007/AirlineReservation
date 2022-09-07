package com.example.AirLineReservation.alrdaoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AirLineReservation.alrdao.FlightDao;
import com.example.AirLineReservation.alrmapper.FlightBookingMapper;
import com.example.AirLineReservation.alrmapper.FlightMapper;
import com.example.AirLineReservation.alrmapper.RegisterMapper;
import com.example.AirLineReservation.alrmodel.Flight;
import com.example.AirLineReservation.alrmodel.FlightBooking;
import com.example.AirLineReservation.alrmodel.FlightSearch;

@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	JdbcTemplate jdbctemp;

	public void addFlight(Flight f) {
		String query = "insert into alrflightadmin(flightId,flightName,departure,arrival,from_place,to_place,price,start_time,end_time) values(?,?,?,?,?,?,?,?,?)";
		Object[] values = { f.getFid(), f.getFname(), f.getDeparture(), f.getArrival(), f.getFrom_place(),
				f.getTo_place(), f.getPrice(), f.getStart_time(), f.getEnd_time() };
		int i = jdbctemp.update(query, values);
		System.out.println(i);
	}

	public void searchFlight(FlightSearch fs) {

		String query = "insert into alrsearchflight(from_place,to_place,booking_date) values(?,?,?)";
		Object[] values = { fs.getFrom_place(), fs.getTo_place(), fs.getBooking_date() };
		int i = jdbctemp.update(query, values);
		System.out.println(i);
	}

//	public List<Flight> flightDisplay(FlightSearch fs) {
	public List<Flight> flightDisplay(String from_flace, String departure) {

		String query = "select * from alrflightadmin where from_place=? and departure=?";
		Object[] values = { from_flace, departure };

		List<Flight> data = jdbctemp.query(query, new FlightMapper(), values);

		return data;
		/*
		 * // String query =
		 * "select alrflightadmin.flightId,alrflightadmin.flightName,alrflightadmin.departure,alrflightadmin.arrival,alrflightadmin.from_place,alrflightadmin.to_place,alrflightadmin.price from alrsearchflight inner join alrflightadmin on alrflightadmin.from_place=alrsearchflight.from_place and alrflightadmin.departure=alrsearchflight.booking_date"
		 * ;
		 * 
		 * String
		 * query="select alrflightadmin.flightId,alrflightadmin.flightName,alrflightadmin.departure,alrflightadmin.arrival,alrflightadmin.from_place,alrflightadmin.to_place,alrflightadmin.price from alrsearchflight inner join alrflightadmin on alrflightadmin.from_place=alrsearchflight.from_place where alrflightadmin.departure=?"
		 * ; // String query =
		 * "select alrflightadmin.flightId,alrflightadmin.flightName,alrflightadmin.departure,alrflightadmin.arrival,alrflightadmin.from_place,alrflightadmin.to_place,alrflightadmin.price from alrsearchflight inner join alrflightadmin on alrflightadmin.from_place=? and alrflightadmin.departure=?"
		 * ; // Object[] data= {fs.getBooking_date()}; // List<Flight> values =
		 * jdbctemp.query(query,new FlightMapper(),data);
		 * 
		 * String values = jdbctemp.queryForObject(query,String.class,booking_date); //
		 * List<Flight> values = jdbctemp.query(query,new FlightMapper()); return
		 * values;
		 */
	}

	public List<Flight> flightDisplay1(String from_flace, String departure) {
		String query = "select * from alrflightadmin where from_place=? and departure=?";
		Object[] values = { from_flace, departure };
		List<Flight> data = jdbctemp.query(query, new FlightMapper(), values);
		return data;
	}

	public List<Flight> ticketBooking(String id) {
//	public String ticketBooking(String id) {
		String query = "select * from alrflightadmin where flightId=?";
		Object[] values = { id };
		List<Flight> data = jdbctemp.query(query, new FlightMapper(), values);
//		String value=jdbctemp.queryForObject(query, String.class, id);
		return data;

	}

	public void seatCheck(String fid) {
		String query = "update flightbooking set seat=seat-1 where cls=flightId";

	}

	public void bookingFlight(FlightBooking fb, String cls) {
		String query = "insert into flightbooking(flightId,name,email,dob,nationality,mobile,address,seat_no,booking_id,pnr_number,price,class,seat,flightName) values(?,?,?,?,?,?,?,flight_seat_val.nextval,flight_booking_val.nextval,flight_pnr_val.nextval,?,?,?,?)";
		Object[] values = { fb.getFid(), fb.getName(), fb.getEmail(), fb.getDob(), fb.getNationality(), fb.getMobile(),
				fb.getAddr(), fb.getBprice(), fb.getClsValue(), fb.getSeatAvail(), fb.getFname() };

		int i = jdbctemp.update(query, values);
		System.out.println(i);

		// *******************

		/*
		 * String query1 = "update flightbooking set seat=seat-1 where class=?";
		 * Object[] values1 = { cls }; int j = jdbctemp.update(query1, values1);
		 * System.out.println(j);
		 * 
		 * String query2 =
		 * "select min(seat) from flightbooking where class =? order by seat asc";
		 * Object[] values2 = { cls }; int k = jdbctemp.queryForObject(query2,int.class,
		 * values2); return k;
		 */

		// *******************
	}

	public int seatAvailCheck(String id, String cls) {
		/*
		 * String query1 =
		 * "update flightbooking set seat=seat-1 where class=? and flightId=?"; Object[]
		 * values1 = { cls, id }; int j = jdbctemp.update(query1, values1);
		 * System.out.println(j);
		 */

		String query2 = "select min(seat) from flightbooking where class =? and flightId=?";
		Object[] values2 = { cls, id };
		int k = jdbctemp.queryForObject(query2, int.class, values2);
		return k;
	}

	public void seatCountDecrease(String id,String cls) {
		String query1 = "update flightbooking set seat=seat-1 where class=? and flightId=?";
		Object[] values1 = { cls, id };
		int j = jdbctemp.update(query1, values1);
		System.out.println(j);
	}
	public List<FlightBooking> flightInfoAdmin() {
		String query = "select * from flightbooking";
		List<FlightBooking> data = jdbctemp.query(query, new FlightBookingMapper());
		return data;
	}

}
