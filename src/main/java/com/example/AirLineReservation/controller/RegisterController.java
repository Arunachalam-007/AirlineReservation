package com.example.AirLineReservation.controller;

import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.AirLineReservation.daoimpl.RegisterDaoImpl;
import com.example.AirLineReservation.dto.PassengerDTO;
import com.example.AirLineReservation.model.Admin;
import com.example.AirLineReservation.model.Passenger;
import com.example.AirLineReservation.service.ServiceALR;

@Controller
public class RegisterController {

	@Autowired
	RegisterDaoImpl registerDaoImpl;

	@Autowired
	ServiceALR serviceALR;

	Admin admin = new Admin();

	PassengerDTO passengerdto = new PassengerDTO();

	Passenger passenger = new Passenger();

	@PostMapping("/search")
	public String registerdetails(@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("dateOfBirth") String dateOfBirth) {

		passengerdto.setPassengerName(name);
		passengerdto.setPassengerAddr(address);
		passengerdto.setPassengerMobile(mobile);
		passengerdto.setPassengerEmail(email);
		passengerdto.setPassengerUsername(username);
		passengerdto.setPassengerPassword(password);

		LocalDate dob1 = LocalDate.parse(dateOfBirth);
		Date date = Date.valueOf(dob1);

		passengerdto.setPassengerDateOfBirth(date);

		serviceALR.passengerService(passengerdto);
		return "Search.jsp";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, Model model) {

		if (username.equals(admin.getAdminUsername()) && password.equals(admin.getAdminPassword())) {
			session.setAttribute("username", username);
			return "/bookedticketinfoadmin";
		} else if (registerDaoImpl.checkLogin(username,password)) {
			session.setAttribute("username", username);
			return "Search.jsp";
		}
		else {
			model.addAttribute("error", "Invalid Account");
			return "redirect:/Index.jsp";		
		}	
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session ) {
	    session.invalidate();
	    return "redirect:/login";
	}

}
