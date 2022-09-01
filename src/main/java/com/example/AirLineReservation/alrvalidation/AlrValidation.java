package com.example.AirLineReservation.alrvalidation;

public class AlrValidation {

	public boolean nameVal(String name) {
		if((name.trim().length()>3)&&(!name.equals(""))) {
			return true;
		}
		return false;
		
	}
}
