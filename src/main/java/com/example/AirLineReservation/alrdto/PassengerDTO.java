package com.example.AirLineReservation.alrdto;

import java.sql.Date;

public class PassengerDTO {
	private String passengerName;
	private String passengerAddr;
	private String passengerMobile;
	private String passengerEmail;
	private String passengerUsername;
	private String passengerPassword;
	private Date passengerDob;
	@Override
	public String toString() {
		return "PassengerDTO [passengerName=" + passengerName + ", passengerAddr=" + passengerAddr
				+ ", passengerMobile=" + passengerMobile + ", passengerEmail=" + passengerEmail + ", passengerUsername="
				+ passengerUsername + ", passengerPassword=" + passengerPassword + ", passengerDob=" + passengerDob
				+ "]";
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerAddr() {
		return passengerAddr;
	}
	public void setPassengerAddr(String passengerAddr) {
		this.passengerAddr = passengerAddr;
	}
	public String getPassengerMobile() {
		return passengerMobile;
	}
	public void setPassengerMobile(String passengerMobile) {
		this.passengerMobile = passengerMobile;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerUsername() {
		return passengerUsername;
	}
	public void setPassengerUsername(String passengerUsername) {
		this.passengerUsername = passengerUsername;
	}
	public String getPassengerPassword() {
		return passengerPassword;
	}
	public void setPassengerPassword(String passengerPassword) {
		this.passengerPassword = passengerPassword;
	}
	public Date getPassengerDob() {
		return passengerDob;
	}
	public void setPassengerDob(Date passengerDob) {
		this.passengerDob = passengerDob;
	}

}
