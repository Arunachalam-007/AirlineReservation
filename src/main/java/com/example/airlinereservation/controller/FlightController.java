package com.example.airlinereservation.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.airlinereservation.daoimpl.FlightDaoImpl;
import com.example.airlinereservation.dto.FlightBookingDTO;
import com.example.airlinereservation.dto.FlightDTO;
import com.example.airlinereservation.dto.FlightSearchDTO;

import com.example.airlinereservation.model.Flight;
import com.example.airlinereservation.model.FlightBooking;
import com.example.airlinereservation.model.Passenger;
import com.example.airlinereservation.service.ServiceALR;
import com.example.airlinereservation.validation.SignupValidation;

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
	


	@PostMapping("/adminflight")
	public String flightInfo(@RequestParam("flightid") String flightId, @RequestParam("flightname") String flightName,
			@RequestParam("departure") String departure, @RequestParam("arrival") String arrival,
			@RequestParam("start_time") String startTime, @RequestParam("end_time") String endTime,
			@RequestParam("from") String fromPlace, @RequestParam("to") String toPlace,
			@RequestParam("price") String price, @RequestParam("seat") int seat,Model mod) {

		flightdto.setFlightId(flightId);
		flightdto.setFlightName(flightName);
		flightdto.setFlightDeparture(departure);
		flightdto.setFlightArrival(arrival);

		flightdto.setFlightSeat(seat);

		flightdto.setStartTime(startTime);
		flightdto.setEndTime(endTime);

		flightdto.setFlightFromPlace(fromPlace);
		flightdto.setFlightToPlace(toPlace);

		flightdto.setPrice(price);

		serviceALR.flightService(flightdto);

		return "Index.jsp";

	}

	@PostMapping("/flightsearch")
	public String flightSearchController(@RequestParam("from_place") String fromPlace,
			@RequestParam("to_place") String toPlace, @RequestParam("bookingDate") String bookingDate, Model mod) {

		LocalDate bookDate = LocalDate.parse(bookingDate);
		Date date = Date.valueOf(bookDate);
		LocalDate bookingDateConversion = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date));

		LocalDate todayDate = LocalDate.now();
		if (bookingDateConversion.isBefore(todayDate)) {
			mod.addAttribute("bookingDateError", "Booking Date cannot been before today");
			return "Search.jsp";
		}

		List<Flight> values = flightDaoImpl.flightsDisplay(fromPlace, bookingDate);
		mod.addAttribute("infos", values);
		return "FlightDisplay.jsp";

	}

	@GetMapping("/ticketbook")
	public String bookingTicket(@RequestParam("flightId") String flightId,
			@RequestParam("bookingClass") String bookingClass, Model mod) {

		List<Flight> result = flightDaoImpl.ticketBooking(flightId);
		mod.addAttribute("bookingvalues", result);

		int seatAvailResult = flightDaoImpl.seatAvailCheck(flightId, bookingClass);
		mod.addAttribute("seatAvailResult", seatAvailResult);

		return "TicketBooking.jsp";
	}

	@PostMapping("/searchflightwithoutlogin")
	public String searchFlightwoutLogin(@RequestParam("from_place") String fromPlace,
			@RequestParam("to_place") String toPlace, @RequestParam("bookingDate") String bookingDate, Model mod) {
		List<Flight> result = flightDaoImpl.flightDisplayInfo(fromPlace, bookingDate);
		mod.addAttribute("infos", result);
		return "FlightDisplay.jsp";
	}

	@GetMapping("/bookingpay")
	public String ticketBookingPay(@RequestParam("flightid") String flightId,
			@RequestParam("seatavailabilityresult") int seatResult, Model mod, HttpSession session) {

		if (session.getAttribute("passengerusername") != null) {
			List<Flight> result = flightDaoImpl.ticketBooking(flightId);
			mod.addAttribute("flightid_value", result);
			if (seatResult != 36) {
				return "BookInfo.jsp";
			} else {
				return "Index.jsp";
			}
		} else {
			return "Index.jsp";
		}
	}

	@PostMapping("/payticketbooking")
	public String bookingInfoPay(@RequestParam("bookingclass") String bookingClass,
			@RequestParam("bookingprice") String bookingPrice, @RequestParam("flightId") String flightId,
			@RequestParam("flightName") String flightName, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("dateOfBirth") String dateOfBirth,
			@RequestParam("nationality") String nationality, @RequestParam("mobile") String mobile,
			@RequestParam("address") String address, @RequestParam("username") String username,
			@RequestParam("bookingdate") String bookingDate, @RequestParam("bookingfrom_place") String bookingFromPlace,
			Model mod) {

		flightBooking.setBookingClass(bookingClass);
		try {

			if (bookingClass.equals("Business")) {
				double result = Double.parseDouble(bookingPrice);
				double value = (result + result / 100 * 10);
				bookingPrice = String.valueOf(value);
			}
		} catch (Exception e) {

		}

		LocalDate birthday = LocalDate.parse(dateOfBirth);
		LocalDate today = LocalDate.now();
		int age = today.compareTo(birthday);

		try {
			if ((age <= 10) && (age >= 70)) {
				double result = Double.parseDouble(bookingPrice);
				double value = result / 2;
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

//		LocalDate dateOfBirth1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate dateOfBirth1 = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date));

		LocalDate todayDate = LocalDate.now();
		if (dateOfBirth1.isAfter(todayDate)) {
			mod.addAttribute("doberror", "Date Of Birth cannot been after today");
			return "BookInfo.jsp";
		} else {
			flightBooking.setDob(date);
		}

		flightBooking.setNationality(nationality);

		flightBooking.setMobile(mobile);

		flightBooking.setAddress(address);

		LocalDate conversion = LocalDate.parse(bookingDate);
		Date date1 = Date.valueOf(conversion);
		flightBooking.setBookingDate(date1);

		flightBooking.setBookingFromPlace(bookingFromPlace);

		LocalDate bookingLocalDate = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date1));
		LocalDate todayLocalDate = LocalDate.now();

		if (bookingLocalDate.isBefore(todayLocalDate)) {
			flightDaoImpl.deleteTicketAfterExpired(date1);
		}

		flightDaoImpl.bookingFlight(flightBooking, bookingClass);

		List<FlightBooking> result = flightDaoImpl.confirmPasengerInfo(name, date);
		mod.addAttribute("confirmPassengers", result);
		flightDaoImpl.seatCountDecrease(flightId, bookingClass);
		return "BookConfirm.jsp";
	}

	@PostMapping("/bookedticketinfoadmin")
	public String bookedInfoToAdmin(Model mod) {
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
	public String passengerCancelTicket(@RequestParam("bookid") String bookingId,
			@RequestParam("username") String username, @RequestParam("flightId") String flightId, Model mod) {
		flightDaoImpl.cancelTicket(bookingId, flightId);
		List<FlightBooking> result = flightDaoImpl.passengerBookedTicket(username);
		mod.addAttribute("passengerbookedticketvalue", result);
		return "TicketDetails.jsp";
	}

	@GetMapping("/bookedTicketDisplay")
	public String bookedTicketDisplay(Model mod) {
		List<FlightBooking> result = flightDaoImpl.flightInfoAdmin();
		mod.addAttribute("bookedticketval", result);
		return "AdminDashboard.jsp";
	}

	@GetMapping("/passengerDisplayToAdmin")
	public String passengerDetails(Model mod) {
		List<Passenger> passengerResult = flightDaoImpl.passengerInfo();
		mod.addAttribute("passengerInfo", passengerResult);
		return "PassengerInfo.jsp";
	}

	@GetMapping("/deletepassenger")
	public String deletePassengerByAdmin(@RequestParam("username") String username, Model mod) {
		flightDaoImpl.deletePassenger(username);
		List<Passenger> passengerResult = flightDaoImpl.passengerInfo();
		mod.addAttribute("passengerInfo", passengerResult);
		return "PassengerInfo.jsp";
	}

	@GetMapping("/viewFlight")
	public String viewFlight(Model mod) {
		List<Flight> flightResult = flightDaoImpl.viewFlight();
		mod.addAttribute("flightInfo", flightResult);
		return "ViewFlight.jsp";
	}

	@GetMapping("/deleteflight")
	public String deleteFlightByAdmin(@RequestParam("flightId") String flightId, @RequestParam("seat") int seat,
			Model mod) {
		if (seat == 40) {
			flightDaoImpl.deleteFlight(flightId);
		}
		else {
			mod.addAttribute("seatDeleteError","This Flight has booked so can't to delete");
			
		}
		List<Flight> flightResult = flightDaoImpl.viewFlight();
		mod.addAttribute("flightInfo", flightResult);
		return "ViewFlight.jsp";

	}

}
