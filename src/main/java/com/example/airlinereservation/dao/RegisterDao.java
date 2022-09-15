package com.example.airlinereservation.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.airlinereservation.model.Feedback;
import com.example.airlinereservation.model.Passenger;

public interface RegisterDao {

	void registerInfo(Passenger p, String uname);

	boolean checkLogin(String username, String password);

	boolean usernameAvailCheck(String username);

	int updatePassword(String username, String password) throws SQLException;

	void feedBackInsert(Feedback feedback);

	List<Feedback> feedBackView();

	boolean usernameexistcheck(String username) throws SQLException;

	boolean emailexistcheck(String email) throws SQLException;

	boolean mobileExistCheck(String mobile)throws SQLException;

}
