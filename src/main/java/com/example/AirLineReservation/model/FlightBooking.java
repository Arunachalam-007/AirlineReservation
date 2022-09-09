package com.example.AirLineReservation.model;

import java.sql.Date;

public class FlightBooking {
	private String bookingPrice;
	private String bookingClass;
	private String bookingId;
	private String pnr;
	private String seatNumber;
	private String userName;
	private Date booking_date;
	private String booking_from_place;
	public String getBooking_from_place() {
		return booking_from_place;
	}
	public void setBooking_from_place(String booking_from_place) {
		this.booking_from_place = booking_from_place;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	private int seatAvailability=40;
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	
	public String getSeatNumber() {
		return seatNumber;
	}
	public String getBookingPrice() {
		return bookingPrice;
	}
	public void setBookingPrice(String bookingPrice) {
		this.bookingPrice = bookingPrice;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	private String fid;
	private String fname;
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
	private String name;
	private String email;
	private Date dob;
	private String nationality;
	private String mobile;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FlightBooking [bookingPrice=" + bookingPrice + ", bookingClass=" + bookingClass + ", bookingId="
				+ bookingId + ", pnr=" + pnr + ", seatNumber=" + seatNumber + ", userName=" + userName
				+ ", booking_date=" + booking_date + ", booking_from_place=" + booking_from_place
				+ ", seatAvailability=" + seatAvailability + ", fid=" + fid + ", fname=" + fname + ", name=" + name
				+ ", email=" + email + ", dob=" + dob + ", nationality=" + nationality + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	public String getBookingClass() {
		return bookingClass;
	}
	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
