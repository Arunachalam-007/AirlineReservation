package com.example.AirLineReservation.daoimpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AirLineReservation.dao.RegisterDao;
import com.example.AirLineReservation.model.Passenger;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbctemp;
	public void registerInfo(Passenger passenger, String uname) {

		Logger logger = LoggerFactory.getLogger(RegisterDaoImpl.class);
		String insertQuery = "insert into alrpassenger(name,address,mobile,email,username,password,dob) values(?,?,?,?,?,?,?)";
		Object[] values = { passenger.getName(), passenger.getAddress(), passenger.getMobile(), passenger.getEmail(), passenger.getUname(), passenger.getPassword(),
				passenger.getDateOfBirth() };
		int i = jdbctemp.update(insertQuery, values);
//		logger.info("1 row affected");
//		logger.trace("trace");
//		logger.error("logger error");

	}
	
	public boolean checkLogin(String username,String password) {
		String selectQuery="select username from alrpassenger where username=? and password=?";
		Object[] values= {username,password};
		String result;
		
		try {	
			result=jdbctemp.queryForObject(selectQuery,String.class,values);
			System.out.println(result);
			if(result.equals(username)) {
				return true;
			}
			else {
				return false;
			}	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}

}
