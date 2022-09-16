package com.example.airlinereservation.controller;

import java.sql.Date;
import java.sql.SQLException;
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
import com.example.airlinereservation.exception.LoginException;
import com.example.airlinereservation.model.Admin;
import com.example.airlinereservation.model.Feedback;

import com.example.airlinereservation.model.Passenger;
import com.example.airlinereservation.service.ServiceALR;
import com.example.airlinereservation.validation.SignupValidation;

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

	String signupPage = "Signup.jsp";
	String forgotPasswordPage = "ForgotPassword.jsp";

	SignupValidation signupValidation = new SignupValidation();

	@PostMapping("/search")
	public String registerDetails(@RequestParam("name") String name, @RequestParam("address") String address,
			@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("dateOfBirth") String dateOfBirth, Model mod,HttpSession session) throws SQLException {

		if (signupValidation.nameValidation(name)) {
			passengerdto.setPassengerName(name);
		} else {
			mod.addAttribute("nameerror",
					"Enter valid name and name cannot be empty should be greater than 2 character");
			return signupPage;
		}

		if (signupValidation.addressValidation(address)) {
			passengerdto.setPassengerAddr(address);
		} else {
			mod.addAttribute("addresserror",
					"Enter valid address and address cannot be empty should be greater than 6 character");
			return signupPage;
		}

		if (registerDaoImpl.mobileExistCheck(mobile)) {
			mod.addAttribute("mobileexist", "Mobile Number Already Exist");
			return signupPage;
		} else {
			if (signupValidation.mobileValidation(mobile)) {
				passengerdto.setPassengerMobile(mobile);
			} else {
				mod.addAttribute("mobileerror",
						"Enter valid mobile number and mobile cannot be empty should be 10 character ");
				return signupPage;
			}
		}

		if (registerDaoImpl.emailexistcheck(email)) {
			mod.addAttribute("emailexist", "Email Already Exist");
			return signupPage;
		} else {

			if (signupValidation.emailValidation(email)) {
				passengerdto.setPassengerEmail(email);
			} else {
				mod.addAttribute("emailerror",
						"Enter valid email and email cannot be empty should be greater than 4 character");
				return signupPage;
			}
		}

		if (registerDaoImpl.usernameexistcheck(username)) {
			mod.addAttribute("exist", "Username Already Exist");
			return signupPage;
		} else {

			if (signupValidation.usernameValidation(username)) {
				passengerdto.setPassengerUsername(username);
				
			} else {
				mod.addAttribute("usernameerror",
						"Enter valid username and username cannot be empty should be greater than 2 character");
				return signupPage;
			}
		}

		if (signupValidation.passwordValidation(password)) {
			passengerdto.setPassengerPassword(password);
		} else {
			mod.addAttribute("passworderror",
					"Enter valid password and password cannot be empty should be greater than 6 character");
			return signupPage;
		}

		LocalDate today = LocalDate.now();
		LocalDate dob1 = LocalDate.parse(dateOfBirth);
		Date date = Date.valueOf(dob1);

		if (dob1.isAfter(today)) {
			mod.addAttribute("doberror", "Date Of Birth cannot been after today");
			return signupPage;
		} else {
			passengerdto.setPassengerDateOfBirth(date);
		}

		serviceALR.passengerService(passengerdto);
		
		session.setAttribute("signupUsername", username);
		return "Search.jsp";
	}

	@PostMapping("login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, Model model) throws LoginException {

		if (username.equals(admin.getAdminUsername()) && password.equals(admin.getAdminPwd())) {

			session.setAttribute("username", username);

			return "/bookedticketinfoadmin";
		} else if (registerDaoImpl.checkLogin(username, password)) {
			session.setAttribute("passengerusername", username);
			return "Search.jsp";
		}

		else {
			model.addAttribute("error", "Invalid Account");
			return "Index.jsp";

		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("passengerusername");
		session.removeAttribute("signupUsername");
		return "Index.jsp";
	}

	@PostMapping("/forgotpassword")
	public String updatePassword(@RequestParam("username") String username, @RequestParam("password1") String password,
			@RequestParam("password2") String confirmPassword, Model mod) throws SQLException {
		if (password.equals(confirmPassword)) {
			if (serviceALR.updatePassword(username, confirmPassword)) {
				mod.addAttribute("msg", "Your password has been changed!");
				return forgotPasswordPage;
			} else {
				mod.addAttribute("message", "Invalid username!");
				return forgotPasswordPage;
			}

		} else {
			mod.addAttribute("messages", "The Change password and Confirm Password should be same!");
			return forgotPasswordPage;
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
