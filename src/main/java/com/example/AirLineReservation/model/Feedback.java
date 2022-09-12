package com.example.AirLineReservation.model;

public class Feedback {
	private String email;
	private String city;
	private String subject;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Feedback [email=" + email + ", city=" + city + ", subject=" + subject + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
