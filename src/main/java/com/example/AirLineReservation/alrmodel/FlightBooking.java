package com.example.AirLineReservation.alrmodel;

import java.sql.Date;
import java.time.LocalTime;

public class FlightBooking {
	private String bprice;
	private String clsValue;
	private String bookingId;
	private String pnr;
	private String seatNumber;
	private int seatAvail=40;
	
	public int getSeatAvail() {
		return seatAvail;
	}
	public void setSeatAvail(int seatAvail) {
		this.seatAvail = seatAvail;
	}
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
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	/* private LocalTime */
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	private String fid;
	private String fname;
	public String getClsValue() {
		return clsValue;
	}
	public void setClsValue(String clsValue) {
		this.clsValue = clsValue;
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
	private String name;
	private String email;
	private Date dob;
	private String nationality;
	private String mobile;
	private String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FlightBooking [bprice=" + bprice + ", clsValue=" + clsValue + ", bookingId=" + bookingId + ", pnr="
				+ pnr + ", seatNumber=" + seatNumber + ", seatAvail=" + seatAvail + ", fid=" + fid + ", fname=" + fname
				+ ", name=" + name + ", email=" + email + ", dob=" + dob + ", nationality=" + nationality + ", mobile="
				+ mobile + ", addr=" + addr + "]";
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
