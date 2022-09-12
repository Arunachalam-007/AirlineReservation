package com.example.AirLineReservation.daoimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AirLineReservation.dao.RegisterDao;
import com.example.AirLineReservation.mapper.FeedbackMapper;
import com.example.AirLineReservation.model.Feedback;

import com.example.AirLineReservation.model.Passenger;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbctemp;

	public void registerInfo(Passenger passenger, String uname) {

		String insertQuery = "insert into alrpassenger(name,address,mobile,email,username,password,dob) values(?,?,?,?,?,?,?)";
		Object[] values = { passenger.getName(), passenger.getAddress(), passenger.getMobile(), passenger.getEmail(),
				passenger.getUname(), passenger.getPassword(), passenger.getDateOfBirth() };
		jdbctemp.update(insertQuery, values);


	}


	public boolean checkLogin(String username, String password) {
		String selectQuery = "select username from alrpassenger where username=? and password=?";
		Object[] values = { username, password };
		String result;

		try {
			result = jdbctemp.queryForObject(selectQuery, String.class, values);
			System.out.println(result);
			if (result.equals(username)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean usernameAvailCheck(String username) {
		String selectQuery = "select name from alrpassenger where username=?";
		Object[] values = { username };
		String result;
		try {
			result = jdbctemp.queryForObject(selectQuery, String.class, values);
			System.out.println(result);
			if (result.equals(username)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public int updatePassword(String username, String password) {
		String updatePassword = "update alrpassenger set password = ? where username = ?";
		Object[] userData = { password, username };
		try {
			int noOfRowsAffected = jdbctemp.update(updatePassword, userData);
			return noOfRowsAffected;
		} catch (Exception e) {
			return 0;
		}

	}

	public void feedBackInsert(Feedback feedback) {
		String insertQuery="insert into feedback(email,city,subject) values(?,?,?)";
		Object[] values = { feedback.getEmail(),feedback.getCity(),feedback.getSubject()};
		jdbctemp.update(insertQuery, values);		
	}
	
	public List<Feedback> feedBackView(){
		String selectQuery="select email,city,subject from feedback";
		List<Feedback> data = jdbctemp.query(selectQuery, new FeedbackMapper());
		return data;
	}
}
