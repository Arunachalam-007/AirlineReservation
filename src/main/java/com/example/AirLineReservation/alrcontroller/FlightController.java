package com.example.AirLineReservation.alrcontroller;

import java.util.List;
import java.sql.Time;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.AirLineReservation.alrdaoimpl.FlightDaoImpl;
import com.example.AirLineReservation.alrdto.FlightBookingDTO;
import com.example.AirLineReservation.alrdto.FlightDTO;
import com.example.AirLineReservation.alrdto.FlightSearchDTO;
import com.example.AirLineReservation.alrmodel.Flight;
import com.example.AirLineReservation.alrmodel.FlightBooking;
import com.example.AirLineReservation.alrmodel.FlightSearch;
import com.example.AirLineReservation.alrservice.ServiceALR;

@Controller
public class FlightController {

	@Autowired
	ServiceALR sALR;

	@Autowired
	FlightDaoImpl fdi;

	FlightDTO fdto = new FlightDTO();

	FlightSearchDTO fsdto = new FlightSearchDTO();

	FlightBookingDTO fbdto = new FlightBookingDTO();
	
	FlightBooking fb=new FlightBooking();

	// Admin Adding flights
	@PostMapping("/adminflight")
	public String flightInfo(@RequestParam("fid") String fid, @RequestParam("fname") String fname,
			@RequestParam("departure") String departure, @RequestParam("arrival") String arrival,
			@RequestParam("start_time") String start_time, @RequestParam("end_time") String end_time,
			@RequestParam("from") String from_place, @RequestParam("to") String to_place,
			@RequestParam("price") String price) throws ParseException {

		fdto.setFlightId(fid);
		fdto.setFlightName(fname);
		fdto.setFlightDeparture(departure);
		fdto.setFlightArrival(arrival);

//		LocalTime start_time_value = LocalTime.parse(start_time);
//		fdto.setStart_time(start_time_value);
		fdto.setStart_time(start_time);
		fdto.setEnd_time(end_time);

		/* String endTimeString=end_time.toString(); */
//		LocalTime end_time_value = LocalTime.parse(end_time);
//		fdto.setEnd_time(end_time_value);

		fdto.setFlightFromPlace(from_place);
		fdto.setFlightToPlace(to_place);

		fdto.setPrice(price);

		sALR.flightService(fdto);

		return "Index.jsp";

	}

	@PostMapping("/flightsearch")
	public String flightSearchController(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bdate") String bdate, Model mod) {

		List<Flight> l = fdi.flightDisplay(from_place, bdate);
		mod.addAttribute("infos", l);
		return "FlightDisplay.jsp";

	}

//	@RequestMapping(value = "/ticketbook/{fid}")

//	public String bookingTicket(@PathVariable String fid, Model mod) {
	@GetMapping("/ticketbook")
	public String bookingTicket(@RequestParam("id") String fid,@RequestParam("cls") String cls, Model mod) {

	
		List<Flight> f = fdi.ticketBooking(fid);
		mod.addAttribute("bookingvalues", f);
		
		int seatAvailResult=fdi.seatAvailCheck(fid,cls);
		mod.addAttribute("seatAvailResult",seatAvailResult);
		return "TicketBooking.jsp";
	}

	@PostMapping("/searchflightwithoutlogin")
	public String searchFlightwoutLogin(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bdate") String bdate, Model mod) {
		List<Flight> l = fdi.flightDisplay1(from_place, bdate);
		mod.addAttribute("infos", l);
		return "FlightDisplay.jsp";
	}

//	@RequestMapping(value = "/ticketbook/bookingpay/{fid}")
	@GetMapping("/bookingpay")
//	public String ticketBookingPay(@PathVariable String fid, Model mod) {
	public String ticketBookingPay(@RequestParam("id") String fid, Model mod) {

		/*
		 * mod.addAttribute("fid_value", l); List<Flight> l =
		 * fdi.flightDisplay1(from_place, bdate);
		 */
		List<Flight> f = fdi.ticketBooking(fid);
		mod.addAttribute("fid_value", f);
		return "BookInfo.jsp";
	}

//	@PostMapping("/ticketbook/bookingpay/payticketbooking")
	@PostMapping("/payticketbooking")
	public String bookingInfoPay(@RequestParam("cls_value") String cls, @RequestParam("bprice") String bprice,
			@RequestParam("fId") String fid, @RequestParam("fname") String fname, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("dob") String dob,
			@RequestParam("nationality") String nationality, @RequestParam("mobile") String mobile,
			@RequestParam("addr") String addr,Model mod) {

//		fbdto.setBookingclsValue(cls);
		fb.setClsValue(cls);
		try {
			if (cls.equals("Economy")) {
				bprice = bprice;
			} else if (cls.equals("Business")) {
				double result = Double.parseDouble(bprice);
				double value = (double) (result + result / 100 * 10);
				bprice = String.valueOf(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		LocalDate birthday = LocalDate.parse(dob);
		LocalDate today = LocalDate.now();
		int age = today.compareTo(birthday);

		try {
			if (age <= 10) {
				double result = Double.parseDouble(bprice);
				double value = (Double) result / 2;
				bprice = String.valueOf(value);
			} else if (age >= 70) {
				double result = Double.parseDouble(bprice);
				double value = (Double) result / 2;
				bprice = String.valueOf(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		fb.setBprice(bprice);
		fb.setFid(fid);
		fb.setFname(fname);
		fb.setName(name);
		fb.setEmail(email);
//		fbdto.setBookingPrice(bprice);
//		fbdto.setBookingFid(fid);
//		fbdto.setBookingFname(fname);
//		fbdto.setBookingName(name);
//		fbdto.setBookingEmail(email);

		LocalDate dob1 = LocalDate.parse(dob);
		Date date = Date.valueOf(dob1);
//		fbdto.setBookingDob(date);
		fb.setDob(date);

		fb.setNationality(nationality);
		fb.setMobile(mobile);
		fb.setAddr(addr);
//		fbdto.setBookingNationality(nationality);
//		fbdto.setBookingMobile(mobile);
//		fbdto.setBookingAddr(addr);

//		sALR.bookingFlight(fbdto);
		
		fdi.bookingFlight(fb, cls);
		
		fdi.seatCountDecrease(fid,cls);
//		int seatAvailVal=fdi.bookingFlight(fb, cls);
//		mod.addAttribute("seatAvailVal",seatAvailVal);

		return "Index.jsp";
//		return "Search.jsp";
	}

	@GetMapping("/bookedticketinfoadmin")
	public String bookedInfoAdmin(Model mod) {
		List<FlightBooking> fb = fdi.flightInfoAdmin();
		mod.addAttribute("bookedticketval", fb);
		return "FlightInfo.jsp";
	}
	
	

//	@PostMapping("/displayflight")
//	public String displayDetails(Model mod) {
//		List<Flight> f=fdi.flightDisplay();
//		mod.addAttribute(f);
//		return "FlightInfo.jsp";
//	}

}
