package com.example.airlinereservation.daoimpl;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.airlinereservation.dao.RegisterDao;
import com.example.airlinereservation.mapper.FeedbackMapper;
import com.example.airlinereservation.model.Feedback;
import com.example.airlinereservation.model.Passenger;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbctemp;

	List<Feedback> feedbackData;

	int noOfRowsAffected;

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

			if (result.equals(username)) {
				return true;
			} else {
				throw new Exception();
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

			if (result.equals(username)) {
				return true;
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public int updatePassword(String username, String password) throws SQLException {
		String updatePassword = "update alrpassenger set password = ? where username = ?";
		Object[] userData = { password, username };
		noOfRowsAffected = jdbctemp.update(updatePassword, userData);
		return noOfRowsAffected;

	}

	public void feedBackInsert(Feedback feedback) {
		String insertQuery = "insert into feedback(email,city,subject) values(?,?,?)";
		Object[] values = { feedback.getEmail(), feedback.getCity(), feedback.getSubject() };
		jdbctemp.update(insertQuery, values);
	}

	public List<Feedback> feedBackView() {
		String selectQuery = "select email,city,subject from feedback";
		feedbackData = jdbctemp.query(selectQuery, new FeedbackMapper());
		return feedbackData;
	}

	public boolean usernameexistcheck(String username) throws SQLException {
		String selectQuery = "select username from alrpassenger where username=?";
		Object[] userData = { username };
		String result = jdbctemp.queryForObject(selectQuery, String.class, userData);

		if (!result.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		

	}
	
	public boolean emailexistcheck(String email) throws SQLException {
		String selectQuery = "select email from alrpassenger where email=?";
		Object[] userData = { email };
		String result = jdbctemp.queryForObject(selectQuery, String.class, userData);

		if (!result.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		

	}
	
	public boolean mobileExistCheck(String mobile) throws SQLException {
		String selectQuery = "select mobile from alrpassenger where mobile=?";
		Object[] userData = { mobile };
		String result = jdbctemp.queryForObject(selectQuery, String.class, userData);

		if (!result.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		

	}
}