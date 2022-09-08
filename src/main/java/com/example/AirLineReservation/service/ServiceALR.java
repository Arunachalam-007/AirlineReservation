package com.example.AirLineReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirLineReservation.daoimpl.FlightDaoImpl;
import com.example.AirLineReservation.daoimpl.RegisterDaoImpl;
import com.example.AirLineReservation.dto.FlightDTO;
import com.example.AirLineReservation.dto.PassengerDTO;
import com.example.AirLineReservation.model.Flight;
import com.example.AirLineReservation.model.Passenger;

@Service
public class ServiceALR {

	@Autowired
	RegisterDaoImpl rdi;
	
	@Autowired
	FlightDaoImpl fdi;

	public void passengerService(PassengerDTO pdto) {
		Passenger p = new Passenger();

		p.setName(pdto.getPassengerName());
		p.setAddress(pdto.getPassengerAddr());
		p.setMobile(pdto.getPassengerMobile());
		p.setEmail(pdto.getPassengerEmail());
		p.setUname(pdto.getPassengerUsername());
		p.setPassword(pdto.getPassengerPassword());
		p.setDateOfBirth(pdto.getPassengerDateOfBirth());

		rdi.registerInfo(p, p.getUname());
	}
	
	public void flightService(FlightDTO fdto) {
		Flight f=new Flight();
		
		f.setFlightId(fdto.getFlightId());
		f.setFlightName(fdto.getFlightName());
		f.setDeparture(fdto.getFlightDeparture());
		f.setStart_time(fdto.getStart_time());
		f.setEnd_time(fdto.getEnd_time());
		f.setArrival(fdto.getFlightArrival());
		f.setFrom_place(fdto.getFlightFromPlace());
		f.setTo_place(fdto.getFlightToPlace());
		f.setPrice(fdto.getPrice());
		f.setSeat(fdto.getFlightSeat());
		
		
		fdi.addFlight(f);
	}

	

}
