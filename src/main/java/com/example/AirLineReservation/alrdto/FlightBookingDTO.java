package com.example.AirLineReservation.alrdto;

import java.sql.Date;

public class FlightBookingDTO {
	private String bookingPrice;
	private String bookingclsValue;
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
	private String bookingName;
	private String bookingEmil;
	private Date bookingDob;
	private String bookingNationality;
	private String bookingMobile;
	private String bookingAddr;
	private String bookingFid;
	private String bookingFname;
	public String getBookingFid() {
		return bookingFid;
	}
	public void setBookingFid(String bookingFid) {
		this.bookingFid = bookingFid;
	}
	public String getBookingFname() {
		return bookingFname;
	}
	public void setBookingFname(String bookingFname) {
		this.bookingFname = bookingFname;
	}
	@Override
	public String toString() {
		return "FlightBookingDTO [bookingPrice=" + bookingPrice + ", bookingclsValue=" + bookingclsValue
				+ ", bookingName=" + bookingName + ", bookingEmil=" + bookingEmil + ", bookingDob=" + bookingDob
				+ ", bookingNationality=" + bookingNationality + ", bookingMobile=" + bookingMobile + ", bookingAddr="
				+ bookingAddr + ", bookingFid=" + bookingFid + ", bookingFname=" + bookingFname + "]";
	}
	public String getBookingName() {
		return bookingName;
	}
	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}
	public String getBookingEmil() {
		return bookingEmil;
	}
	public void setBookingEmil(String bookingEmil) {
		this.bookingEmil = bookingEmil;
	}
	public Date getBookingDob() {
		return bookingDob;
	}
	public void setBookingDob(Date bookingDob) {
		this.bookingDob = bookingDob;
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
	public String getBookingAddr() {
		return bookingAddr;
	}
	public void setBookingAddr(String bookingAddr) {
		this.bookingAddr = bookingAddr;
	}

}
