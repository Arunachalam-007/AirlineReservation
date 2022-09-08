package com.example.AirLineReservation.dao;

import java.util.List;

import com.example.AirLineReservation.model.Passenger;

public interface RegisterDao {

	public void registerInfo(Passenger p,String uname);
	public boolean checkLogin(String username,String password);
	
	
}
