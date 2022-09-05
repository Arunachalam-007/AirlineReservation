package com.example.AirLineReservation.alrcontroller;

import java.util.Date;
import java.util.List;
import java.sql.Time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
import com.example.AirLineReservation.alrdto.FlightDTO;
import com.example.AirLineReservation.alrdto.FlightSearchDTO;
import com.example.AirLineReservation.alrmodel.Flight;
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

	// Admin Adding flights
	@PostMapping("/adminflight")
	public String flightInfo(@RequestParam("fid") String fid, @RequestParam("fname") String fname,
			@RequestParam("departure") String departure, @RequestParam("arrival") String arrival,
			@RequestParam("from") String from_place, @RequestParam("to") String to_place,
			@RequestParam("price") String price) throws ParseException {

		fdto.setFlightId(fid);
		fdto.setFlightName(fname);

//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
//		Date date = (Date) formatter.parse(departure);
//
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//		String departureFormatted = dateFormat.format(date);

		fdto.setFlightDeparture(departure);

//		fdto.setStart_time(start_time);
//		fdto.setEnd_time(end_time);
//		fdto.setFlightDuration(duration);

//		Date date1 = (Date) formatter.parse(arrival);
//
//		String arrivalFormatted = dateFormat.format(date1);
		fdto.setFlightArrival(arrival);

		fdto.setFlightFromPlace(from_place);
		fdto.setFlightToPlace(to_place);

		fdto.setPrice(price);

		sALR.flightService(fdto);

		return "Index";

	}

	@PostMapping("/flightsearch")
	public String flightSearchController(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bdate") String bdate, Model mod) {

//		fsdto.setSearchFromPlace(from_place);
//		fsdto.setSearchToPlace(to_place);
//		fsdto.setSearchBookingDate(bdate);
//
//		sALR.searchFlighService(fsdto);
//		
//		List<Flight> f=fdi.flightDisplay(to_place, bdate)

//		FlightSearch fs=new FlightSearch();
//		List<Flight> f=fdi.flightDisplay(fs);
//		mod.addAttribute("flightdata",f);

		List<Flight> l = fdi.flightDisplay(from_place, bdate);
		mod.addAttribute("infos", l);

		return "FlightDisplay";
//		return "FlightInfo.jsp";

	}

	@RequestMapping(value = "/ticketbook/{fid}")
	public String bookingTicket(@PathVariable String fid, Model mod) {

		List<Flight> f = fdi.ticketBooking(fid);
//		String result=fdi.ticketBooking(fid);
		mod.addAttribute("bookingvalues", f);
		return "TicketBooking";
	}

	@PostMapping("/searchflightwithoutlogin")
	public String searchFlightwoutLogin(@RequestParam("from_place") String from_place,
			@RequestParam("to_place") String to_place, @RequestParam("bdate") String bdate, Model mod) {
		List<Flight> l = fdi.flightDisplay1(from_place, bdate);
		mod.addAttribute("infos", l);
		return "FlightDisplay";
	}

	@RequestMapping(value="/ticketbook/bookingpay/{fid}")
	public String ticketBookingPay(@PathVariable String fid, Model mod) {
		/*
		 * mod.addAttribute("fid_value",l); List<Flight>
		 * l=fdi.flightDisplay1(from_place, bdate);
		 */
		List<Flight> f = fdi.ticketBooking(fid);
		mod.addAttribute("fid_value", f);
		return "BookInfo";
	}

//	@PostMapping("/displayflight")
//	public String displayDetails(Model mod) {
//		List<Flight> f=fdi.flightDisplay();
//		mod.addAttribute(f);
//		return "FlightInfo.jsp";
//	}

}
