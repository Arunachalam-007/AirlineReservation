package com.example.AirLineReservation.alrmodel;

import java.sql.Date;
import java.time.LocalTime;

public class FlightBooking {
	private String bprice;
	private String clsValue;

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
	private String emil;
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
		return "FlightBooking [bprice=" + bprice + ", clsValue=" + clsValue + ", fid=" + fid + ", fname=" + fname
				+ ", name=" + name + ", emil=" + emil + ", dob=" + dob + ", nationality=" + nationality + ", mobile="
				+ mobile + ", addr=" + addr + "]";
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
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
