package com.example.AirLineReservation.dto;

import java.sql.Date;

public class FlightBookingDTO {
	private String bookingPrice;
	private String bookingclsValue;
	private String bookingIdentity;
	private String bookingPNR;
	public String getBookingFlightId() {
		return bookingFlightId;
	}

	public void setBookingFlightId(String bookingFlightId) {
		this.bookingFlightId = bookingFlightId;
	}

	public String getBookingFlightName() {
		return bookingFlightName;
	}

	public void setBookingFlightName(String bookingFlightName) {
		this.bookingFlightName = bookingFlightName;
	}

	private String bookingSeatnumber;
	private String bookingUserName;

	public String getBookingIdentity() {
		return bookingIdentity;
	}

	public void setBookingIdentity(String bookingIdentity) {
		this.bookingIdentity = bookingIdentity;
	}

	public String getBookingPNR() {
		return bookingPNR;
	}

	public void setBookingPNR(String bookingPNR) {
		this.bookingPNR = bookingPNR;
	}

	public String getBookingclsValue() {
		return bookingclsValue;
	}

	public void setBookingclsValue(String bookingclsValue) {
		this.bookingclsValue = bookingclsValue;
	}

	public String getBookingPrice() {
		return bookingPrice;
	}

	public void setBookingPrice(String bookingPrice) {
		this.bookingPrice = bookingPrice;
	}

	public String getBookingUserName() {
		return bookingUserName;
	}

	public void setBookingUserName(String bookingUserName) {
		this.bookingUserName = bookingUserName;
	}

	private String bookingName;
	private String bookingEmail;
	private Date bookingDateOfBirth;
	private String bookingNationality;
	private String bookingMobile;
	private String bookingAddress;
	private String bookingFlightId;
	private String bookingFlightName;

	public Date getBookingDateOfBirth() {
		return bookingDateOfBirth;
	}

	public void setBookingDateOfBirth(Date bookingDateOfBirth) {
		this.bookingDateOfBirth = bookingDateOfBirth;
	}

	@Override
	public String toString() {
		return "FlightBookingDTO [bookingPrice=" + bookingPrice + ", bookingclsValue=" + bookingclsValue
				+ ", bookingIdentity=" + bookingIdentity + ", bookingPNR=" + bookingPNR + ", bookingSeatnumber="
				+ bookingSeatnumber + ", bookingUserName=" + bookingUserName + ", bookingName=" + bookingName
				+ ", bookingEmail=" + bookingEmail + ", bookingDateOfBirth=" + bookingDateOfBirth
				+ ", bookingNationality=" + bookingNationality + ", bookingMobile=" + bookingMobile
				+ ", bookingAddress=" + bookingAddress + ", bookingFlightId=" + bookingFlightId + ", bookingFlightName="
				+ bookingFlightName + "]";
	}

	public String getBookingAddress() {
		return bookingAddress;
	}

	public void setBookingAddress(String bookingAddress) {
		this.bookingAddress = bookingAddress;
	}

	public String getBookingSeatnumber() {
		return bookingSeatnumber;
	}

	public void setBookingSeatnumber(String bookingSeatnumber) {
		this.bookingSeatnumber = bookingSeatnumber;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	public String getBookingEmail() {
		return bookingEmail;
	}

	public void setBookingEmail(String bookingEmail) {
		this.bookingEmail = bookingEmail;
	}

	public String getBookingNationality() {
		return bookingNationality;
	}

	public void setBookingNationality(String bookingNationality) {
		this.bookingNationality = bookingNationality;
	}

	public String getBookingMobile() {
		return bookingMobile;
	}

	public void setBookingMobile(String bookingMobile) {
		this.bookingMobile = bookingMobile;
	}

}
