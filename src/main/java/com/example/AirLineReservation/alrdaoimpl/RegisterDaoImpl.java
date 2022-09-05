package com.example.AirLineReservation.alrdaoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AirLineReservation.alrdao.RegisterDao;
import com.example.AirLineReservation.alrmapper.RegisterMapper;
import com.example.AirLineReservation.alrmodel.Passenger;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbctemp;

	// **************
//	@Autowired
//	RegisterDaoImpl rd;
	// **************
//	private DataSource dataSource;
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//		this.jdbctemp = new JdbcTemplate(dataSource);
//	}

//	public List<Passenger> registerInfo1(String uname) {
	public void registerInfo1(Passenger p, String uname) {

		Logger logger = LoggerFactory.getLogger(RegisterDaoImpl.class);
//		List<Passenger> passenger = jdbctemp.query(query1, new RegisterMapper());
//		ListIterator<Passenger> itr = passenger.listIterator();
//		ListIterator<Passenger> itr = value.listIterator();

//		JFrame frame = new JFrame("Swing Tester");
//		if (itr.hasNext()) {

		// *****************
//		String query1 = "select username from alrpassenger where username=?";
//
//		String value = jdbctemp.queryForObject(query1, String.class, uname);

		// *****************
//		if (value.isEmpty()) {
		String query = "insert into alrpassenger(name,address,mobile,email,username,password,dob) values(?,?,?,?,?,?,?)";
		Object[] values = { p.getName(), p.getAddr(), p.getMobile(), p.getEmail(), p.getUname(), p.getPassword(),
				p.getDob() };
		int i = jdbctemp.update(query, values);
//		logger.info("1 row affected");
//		logger.trace("trace");
//		logger.error("logger error");
		System.out.println(i);

//			JOptionPane.showMessageDialog(frame, "Username already exist");

//		} else {
//			System.out.println("Username Already Exist");
//
//		}

		/*
		 * for(int i=0;i<=passenger.size();i++) {
		 * 
		 * }
		 */
//		return passenger;

	}

	/*
	 * public void registerInfo(Passenger p) {
	 * 
	 * String query =
	 * "insert into alrpassenger(name,address,mobile,email,username,password,dob) values(?,?,?,?,?,?,?)"
	 * ; Object[] values = { p.getName(), p.getAddr(), p.getMobile(), p.getEmail(),
	 * p.getUname(), p.getPassword(), p.getDob() }; jdbctemp.update(query, values);
	 * }
	 */

}
