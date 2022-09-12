package com.example.airlinereservation.dao;



import com.example.airlinereservation.model.Passenger;

public interface RegisterDao {

	public void registerInfo(Passenger p,String uname);
	public boolean checkLogin(String username,String password);
	
	
}
