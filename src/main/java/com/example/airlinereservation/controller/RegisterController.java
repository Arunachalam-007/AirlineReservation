package com.example.airlinereservation.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.airlinereservation.daoimpl.RegisterDaoImpl;
import com.example.airlinereservation.dto.PassengerDTO;
import com.example.airlinereservation.model.Admin;
import com.example.airlinereservation.model.Feedback;

import com.example.airlinereservation.model.Passenger;
import com.example.airlinereservation.service.ServiceALR;

@Controller
public class RegisterController {

	@Autowired
	RegisterDaoImpl registerDaoImpl;

	@Autowired
	ServiceALR serviceALR;

	Admin admin = new Admin();

	PassengerDTO passengerdto = new PassengerDTO();

	Passenger passenger = new Passenger();

	Feedback feedback = new Feedback();

	@PostMapping("/search")
	public String registerdetails(@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("dateOfBirth") String dateOfBirth, Model mod) {

		passengerdto.setPassengerName(name);
		passengerdto.setPassengerAddr(address);
		passengerdto.setPassengerMobile(mobile);
		
		if (registerDaoImpl.emailexistcheck(email)) {
			mod.addAttribute("emailexist", "Email Already Exist");
			return "Signup.jsp";
		} else {
			passengerdto.setPassengerEmail(email);
		}

		
		
		if (registerDaoImpl.usernameexistcheck(username)) {
			mod.addAttribute("exist", "Username Already Exist");
			return "Signup.jsp";
		} else {
			passengerdto.setPassengerUsername(username);
		}
	
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
		} else if (registerDaoImpl.checkLogin(username, password)) {
			session.setAttribute("passengerusername", username);
			return "Search.jsp";
		} else {
			model.addAttribute("error", "Invalid Account");
			return "Index.jsp";

		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("passengerusername");
		return "Index.jsp";
	}

	@PostMapping("/forgotpassword")
	public String updatePassword(@RequestParam("username") String username, @RequestParam("password1") String password,
			@RequestParam("password2") String confirmPassword, Model mod) {
		if (password.equals(confirmPassword)) {
			if (serviceALR.updatePassword(username, confirmPassword)) {
				mod.addAttribute("msg", "Your password has been changed!");
				return "ForgotPassword.jsp";
			} else {
				mod.addAttribute("message", "Invalid username!");
				return "ForgotPassword.jsp";
			}

		} else {
			mod.addAttribute("messages", "The Change password and Confirm Password should be same!");
			return "ForgotPassword.jsp";
		}
	}

	@PostMapping("/contactDetails")
	public String feedBackToAdmin(@RequestParam("email") String email, @RequestParam("city") String city,
			@RequestParam("subject") String subject, Model mod) {

		feedback.setEmail(email);
		feedback.setCity(city);
		feedback.setSubject(subject);

		registerDaoImpl.feedBackInsert(feedback);
		mod.addAttribute("feedbackmessage", "Feedback sended Successfully!");
		return "Contact.jsp";

	}

	@GetMapping("/feedbackview")
	public String feedbackViewToAdmin(Model mod) {
		List<Feedback> feedbackResult = registerDaoImpl.feedBackView();
		mod.addAttribute("feedbackresult", feedbackResult);
		return "FeedbackView.jsp";
	}


}
