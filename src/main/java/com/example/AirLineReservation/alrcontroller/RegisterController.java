package com.example.AirLineReservation.alrcontroller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.AirLineReservation.alrdaoimpl.RegisterDaoImpl;
import com.example.AirLineReservation.alrdto.PassengerDTO;
import com.example.AirLineReservation.alrmodel.Admin;
import com.example.AirLineReservation.alrmodel.Passenger;
import com.example.AirLineReservation.alrservice.ServiceALR;

@Controller
public class RegisterController {

	@Autowired
	RegisterDaoImpl rd;

	@Autowired
	ServiceALR sALR;

	Admin a = new Admin();

	PassengerDTO pdto = new PassengerDTO();

	Passenger p = new Passenger();

	@PostMapping("/search")
	public String registerdetails(@RequestParam("pname") String name, @RequestParam("paddr") String addr,
			@RequestParam("pmobile") String mobile, @RequestParam("pemail") String email,
			@RequestParam("puname") String uname, @RequestParam("pwd") String pwd, @RequestParam("pdob") String dob) {

//		p.setName(uname);
		pdto.setPassengerName(uname);
//		p.setAddr(addr);
		pdto.setPassengerAddr(addr);
//		p.setMobile(mobile);
		pdto.setPassengerMobile(mobile);
//		p.setEmail(email);
		pdto.setPassengerEmail(email);
//		p.setUname(uname);
		pdto.setPassengerUsername(uname);
//		p.setPassword(pwd);
		pdto.setPassengerPassword(pwd);

		LocalDate dob1 = LocalDate.parse(dob);
		Date date = Date.valueOf(dob1);
//		p.setDob(date);
		pdto.setPassengerDob(date);

//		rd.registerInfo(p);

		sALR.passengerService(pdto);
		return "Search.jsp";
	}

	/*
	 * @PostMapping("/login") public String loginDetails(@RequestParam("uname")
	 * String uname,@RequestParam("pwd") String upwd,HttpSession session,ModelMap
	 * modelmap){
	 * 
	 * 
	 * 
	 * return "Search.jsp";
	 * 
	 * 
	 * 
	 * }
	 */
	@PostMapping("/login")
	public String login(@RequestParam("uname") String username, @RequestParam("pwd") String password,
			HttpSession session, Model model) {

//		String query1 = "select username from alrpassenger";
//		List<Passenger> passenger = jdbctemp.query(query1, new RegisterMapper());
//		ListIterator<Passenger> itr = passenger.listIterator();

		if (username.equals(a.getAdminUsername()) && password.equals(a.getAdminPassword())) {
			session.setAttribute("username", username);
			return "AdminDashboard.jsp";
//		if (username.equalsIgnoreCase("arunach123") && password.equalsIgnoreCase("Arun@1234")) {
//			session.setAttribute("username", username);
//			return "Search.jsp";
		} else if (rd.checkLogin(username,password)) {
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
