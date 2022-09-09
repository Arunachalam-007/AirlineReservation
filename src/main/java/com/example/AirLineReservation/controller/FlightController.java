package com.example.AirLineReservation.controller;

import java.util.List;
import java.sql.Date;
import java.time.LocalDate;

import java.text.ParseException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.AirLineReservation.daoimpl.FlightDaoImpl;
import com.example.AirLineReservation.dto.FlightBookingDTO;
import com.example.AirLineReservation.dto.FlightDTO;
import com.example.AirLineReservation.dto.FlightSearchDTO;
import com.example.AirLineReservation.model.Flight;
import com.example.AirLineReservation.model.FlightBooking;
import com.example.AirLineReservation.model.Passenger;
import com.example.AirLineReservation.service.ServiceALR;

@Controller
public class FlightController {

	@Autowired
	ServiceALR serviceALR;

	@Autowired
	FlightDaoImpl flightDaoImpl;

	FlightDTO flightdto = new FlightDTO();

	FlightSearchDTO flightSearchdto = new FlightSearchDTO();

	FlightBookingDTO flightBookingdto = new FlightBookingDTO();

	FlightBooking flightBooking = new FlightBooking();

	// Admin Adding flights
	@PostMapping("/adminflight")
	public String flightInfo(@RequestParam("flightid") String flightId, @RequestParam("flightname") String flightName,
			@RequestParam("departure") String departure, @RequestParam("arrival") String arrival,
			@RequestParam("start_time") String start_time, @RequestParam("end_time") String end_time,
			@RequestParam("from") String from_place, @RequestParam("to") String to_place,
			@RequestParam("price") String price, @RequestParam("seat") int seat) throws ParseException {

		flightdto.setFlightId(flightId);
		flightdto.setFlightName(flightName);
		flightdto.setFlightDeparture(departure);
		flightdto.setFlightArrival(arrival);

		flightdto.setFlightSeat(seat);

		flightdto.setStart_time(start_time);
		flightdto.setEnd_time(end_time);

		flightdto.setFlightFromPlace(from_place);
		flightdto.setFlightToPlace(to_place);

		flightdto.setPrice(price);

		serviceALR.flightService(flightdto);

		return "Index.jsp";

	}

	@PostMapping("/flightsearch")
	public String flightSearchController(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bookingDate") String bookingDate, Model mod) {

		List<Flight> values = flightDaoImpl.flightDisplay(from_place, bookingDate);
		mod.addAttribute("infos", values);
		return "FlightDisplay.jsp";

	}

	@GetMapping("/ticketbook")
	public String bookingTicket(@RequestParam("flightId") String flightId, @RequestParam("bookingClass") String bookingClass, Model mod) {

		List<Flight> result = flightDaoImpl.ticketBooking(flightId);
		mod.addAttribute("bookingvalues", result);

		int seatAvailResult = flightDaoImpl.seatAvailCheck(flightId, bookingClass);
		mod.addAttribute("seatAvailResult", seatAvailResult);
		return "TicketBooking.jsp";
	}

	@PostMapping("/searchflightwithoutlogin")
	public String searchFlightwoutLogin(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bookingDate") String bookingDate, Model mod) {
		List<Flight> result = flightDaoImpl.flightDisplayInfo(from_place, bookingDate);
		mod.addAttribute("infos", result);
		return "FlightDisplay.jsp";
	}

	@GetMapping("/bookingpay")
	public String ticketBookingPay(@RequestParam("flightid") String flightId, Model mod) {

		List<Flight> result = flightDaoImpl.ticketBooking(flightId);
		mod.addAttribute("flightid_value", result);
		return "BookInfo.jsp";
	}

	@PostMapping("/payticketbooking")
	public String bookingInfoPay(@RequestParam("bookingclass") String bookingClass, @RequestParam("bookingprice") String bookingPrice,
			@RequestParam("flightId") String flightId, @RequestParam("flightName") String flightName, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("dateOfBirth") String dateOfBirth,
			@RequestParam("nationality") String nationality, @RequestParam("mobile") String mobile,
			@RequestParam("address") String address, @RequestParam("username") String username,@RequestParam("bookingdate") String bookingDate,@RequestParam("bookingfrom_place") String bookingFromPlace, Model mod) {

		flightBooking.setBookingClass(bookingClass);
		try {
			if (bookingClass.equals("Economy")) {
				bookingPrice = bookingPrice;
			} else if (bookingClass.equals("Business")) {
				double result = Double.parseDouble(bookingPrice);
				double value = (double) (result + result / 100 * 10);
				bookingPrice = String.valueOf(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		LocalDate birthday = LocalDate.parse(dateOfBirth);
		LocalDate today = LocalDate.now();
		int age = today.compareTo(birthday);

		try {
			if (age <= 10) {
				double result = Double.parseDouble(bookingPrice);
				double value = (Double) result / 2;
				bookingPrice = String.valueOf(value);
			} else if (age >= 70) {
				double result = Double.parseDouble(bookingPrice);
				double value = (Double) result / 2;
				bookingPrice = String.valueOf(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		flightBooking.setUserName(username);
		flightBooking.setBookingPrice(bookingPrice);
		flightBooking.setFid(flightId);
		flightBooking.setFname(flightName);
		flightBooking.setName(name);
		flightBooking.setEmail(email);

		LocalDate dob1 = LocalDate.parse(dateOfBirth);
		Date date = Date.valueOf(dob1);
		flightBooking.setDob(date);

		flightBooking.setNationality(nationality);
		flightBooking.setMobile(mobile);
		flightBooking.setAddress(address);
		
		LocalDate conversion = LocalDate.parse(bookingDate);
		Date date1 = Date.valueOf(conversion);
		flightBooking.setBooking_date(date1);
		
		
		flightBooking.setBooking_from_place(bookingFromPlace);

		flightDaoImpl.bookingFlight(flightBooking, bookingClass);

		List<FlightBooking> result=flightDaoImpl.confirmPasengerInfo(name,date);
		mod.addAttribute("confirmPassengers",result);
		flightDaoImpl.seatCountDecrease(flightId, bookingClass);
//		return "Index.jsp";
		return "BookConfirm.jsp";
	}

	@PostMapping("/bookedticketinfoadmin")
	public String bookedInfoAdmin(Model mod) {
		List<FlightBooking> result = flightDaoImpl.flightInfoAdmin();
		mod.addAttribute("bookedticketval", result);
		return "AdminDashboard.jsp";
	}

	@GetMapping("/passengerbookedticket")
	public String bookedDicketForPassenger(@RequestParam("username_value") String username, Model mod) {
		List<FlightBooking> result = flightDaoImpl.passengerBookedTicket(username);
		mod.addAttribute("passengerbookedticketvalue", result);
		return "TicketDetails.jsp";
	}


	@GetMapping("/cancelticket")
	public String passengerCancelTicket(@RequestParam("bookid") String bookingId,@RequestParam("username") String username,@RequestParam("flightId") String flightId, Model mod) {
		flightDaoImpl.cancelTicket(bookingId,flightId);
		List<FlightBooking> result = flightDaoImpl.passengerBookedTicket(username);
		mod.addAttribute("passengerbookedticketvalue", result);
		return "TicketDetails.jsp";
//		return "/passengerbookedticket";
	}
	@GetMapping("/bookedTicketDisplay")
	public String bookedTicketDisplay(Model mod) {
		List<FlightBooking> result = flightDaoImpl.flightInfoAdmin();
		mod.addAttribute("bookedticketval", result);
		return "AdminDashboard.jsp";
	}
	
	@GetMapping("/passengerDisplayToAdmin")
	public String passengerDetails(Model mod) {
		List<Passenger> passengerResult=flightDaoImpl.passengerInfo();
		mod.addAttribute("passengerInfo",passengerResult);
		return "PassengerInfo.jsp";
	}
	
	@GetMapping("/deletepassenger")
	public String deletePassengerByAdmin(@RequestParam("username") String username,Model mod) {
		flightDaoImpl.deletePassenger(username);
		List<Passenger> passengerResult=flightDaoImpl.passengerInfo();
		mod.addAttribute("passengerInfo",passengerResult);
		return "PassengerInfo.jsp";
	}
	
	@GetMapping("/bookconfirm")
	public String bookingConfirm() {
		return null;
	}

}
