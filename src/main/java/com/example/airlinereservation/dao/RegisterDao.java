package com.example.airlinereservation.dao;

import java.util.List;

import com.example.airlinereservation.model.Feedback;
import com.example.airlinereservation.model.Passenger;

public interface RegisterDao {

	void registerInfo(Passenger p, String uname);

	boolean checkLogin(String username, String password);

	boolean usernameAvailCheck(String username);

	int updatePassword(String username, String password);

	void feedBackInsert(Feedback feedback);

	List<Feedback> feedBackView();

	boolean usernameexistcheck(String username);

	boolean emailexistcheck(String email);

	boolean mobileExistCheck(String mobile);

}
