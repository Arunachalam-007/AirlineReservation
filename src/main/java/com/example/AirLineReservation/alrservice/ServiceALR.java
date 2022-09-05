package com.example.AirLineReservation.alrservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;


import com.example.AirLineReservation.alrdaoimpl.FlightDaoImpl;
import com.example.AirLineReservation.alrdaoimpl.RegisterDaoImpl;
import com.example.AirLineReservation.alrdto.FlightDTO;
import com.example.AirLineReservation.alrdto.FlightSearchDTO;
import com.example.AirLineReservation.alrdto.PassengerDTO;
import com.example.AirLineReservation.alrmodel.Flight;
import com.example.AirLineReservation.alrmodel.FlightSearch;
import com.example.AirLineReservation.alrmodel.Passenger;

@Service
public class ServiceALR {

	@Autowired
	RegisterDaoImpl rdi;
	
	@Autowired
	FlightDaoImpl fdi;

	public void passengerService(PassengerDTO pdto) {
		Passenger p = new Passenger();

		// *********************************
//		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfigALR.class);
		// *********************************

		p.setName(pdto.getPassengerName());
		p.setAddr(pdto.getPassengerAddr());
		p.setMobile(pdto.getPassengerMobile());
		p.setEmail(pdto.getPassengerEmail());
		p.setUname(pdto.getPassengerUsername());
		p.setPassword(pdto.getPassengerPassword());
		p.setDob(pdto.getPassengerDob());

		
//		rdi.registerInfo(p);
		// *********************************
//		RegisterDaoImpl rdimpl=ac.getBean("registerDao", RegisterDaoImpl.class);
//		rdimpl.registerInfo1(p, p.getUname());
//		
		
		// *********************************
		rdi.registerInfo1(p, p.getUname());
	}
	
	public void flightService(FlightDTO fdto) {
		Flight f=new Flight();
		
		f.setFid(fdto.getFlightId());
		f.setFname(fdto.getFlightName());
		f.setDeparture(fdto.getFlightDeparture());
//		f.setDuration(fdto.getFlightDuration());
		f.setStart_time(fdto.getStart_time());
		f.setEnd_time(fdto.getEnd_time());
		f.setArrival(fdto.getFlightArrival());
		f.setFrom_place(fdto.getFlightFromPlace());
		f.setTo_place(fdto.getFlightToPlace());
		f.setPrice(fdto.getPrice());
		
		
		fdi.addFlight(f);
	}

	public void searchFlighService(FlightSearchDTO fsdto) {
		FlightSearch fs=new FlightSearch();
		
		
		fs.setFrom_place(fsdto.getSearchFromPlace());
		fs.setTo_place(fsdto.getSearchToPlace());
		fs.setBooking_date(fsdto.getSearchBookingDate());
		
//		fdi.searchFlight(fs);
//		fdi.flightDisplay(fs.getFrom_place(), fs.getBooking_date());
	}
}
