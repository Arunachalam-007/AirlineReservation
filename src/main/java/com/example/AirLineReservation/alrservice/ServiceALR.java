package com.example.AirLineReservation.alrservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.AirLineReservation.alrdaoimpl.RegisterDaoImpl;
import com.example.AirLineReservation.alrdto.PassengerDTO;
import com.example.AirLineReservation.alrmodel.Passenger;

@Service
public class ServiceALR {

	@Autowired
	RegisterDaoImpl rdi;
	
	public void passengerService(PassengerDTO pdto) {
		Passenger p=new Passenger();
		
		p.setName(pdto.getPassengerName());
		p.setAddr(pdto.getPassengerAddr());
		p.setMobile(pdto.getPassengerMobile());
		p.setEmail(pdto.getPassengerEmail());
		p.setUname(pdto.getPassengerUsername());
		p.setPassword(pdto.getPassengerPassword());
		p.setDob(pdto.getPassengerDob());
		
//		rdi.registerInfo(p);
		rdi.registerInfo1(p,p.getUname());
	}
	
}
