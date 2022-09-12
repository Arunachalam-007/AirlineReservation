package com.example.airlinereservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlinereservation.daoimpl.FlightDaoImpl;
import com.example.airlinereservation.daoimpl.RegisterDaoImpl;
import com.example.airlinereservation.dto.FlightDTO;
import com.example.airlinereservation.dto.PassengerDTO;
import com.example.airlinereservation.model.Flight;
import com.example.airlinereservation.model.Passenger;

@Service
public class ServiceALR {

	@Autowired
	RegisterDaoImpl registerDaoImpl;

	@Autowired
	FlightDaoImpl flightDaoImpl;

	public void passengerService(PassengerDTO pdto) {
		Passenger p = new Passenger();

		p.setName(pdto.getPassengerName());
		p.setAddress(pdto.getPassengerAddr());
		p.setMobile(pdto.getPassengerMobile());
		p.setEmail(pdto.getPassengerEmail());
		p.setUname(pdto.getPassengerUsername());
		p.setPassword(pdto.getPassengerPassword());
		p.setDateOfBirth(pdto.getPassengerDateOfBirth());

		registerDaoImpl.registerInfo(p, p.getUname());
	}

	public void flightService(FlightDTO fdto) {
		Flight f = new Flight();

		f.setFlightId(fdto.getFlightId());
		f.setFlightName(fdto.getFlightName());
		f.setDeparture(fdto.getFlightDeparture());
		f.setStartTime(fdto.getStartTime());
		f.setEndTime(fdto.getEndTime());
		f.setArrival(fdto.getFlightArrival());
		f.setFromPlace(fdto.getFlightFromPlace());
		f.setToPlace(fdto.getFlightToPlace());
		f.setPrice(fdto.getPrice());
		f.setSeat(fdto.getFlightSeat());

		flightDaoImpl.addFlight(f);
	}

	public boolean updatePassword(String username, String password) {
		if (registerDaoImpl.usernameAvailCheck(username)) {
			int noOfRowsAffected = registerDaoImpl.updatePassword(username, password);
			if (noOfRowsAffected > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
