package com.example.AirLineReservation.alrmodel;


import java.sql.Timestamp;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {
	private String fid;
	private String fname;
	private String departure;
	private String from_place;
	private String to_place;
	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public String getTo_place() {
		return to_place;
	}
	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}
	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fname=" + fname + ", departure=" + departure + ", from_place=" + from_place
				+ ", to_place=" + to_place + ", start_time=" + start_time + ", end_time=" + end_time + ", arrival="
				+ arrival + ", price=" + price + "]";
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	private String start_time;
	private String end_time;
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	private String arrival;
	private String price;
	

}
