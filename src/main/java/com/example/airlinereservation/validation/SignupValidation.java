package com.example.airlinereservation.validation;

public class SignupValidation {

	public boolean nameValidation(String name) {
		String pattern = "^[a-zA-Z\\s]+";
		if (name.matches(pattern)&&(name.trim().length()>=3)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean addressValidation(String address) {
		String pattern = "^[#.0-9a-zA-Z\\s,-]+$";
		if (address.matches(pattern)&&(address.trim().length()>=7)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mobileValidation(String mobile) {
		String pattern="(0/91)?[7-9][0-9]{9}";
		if(mobile.matches(pattern)&&(mobile.trim().length()==10)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean emailValidation(String email) {
		String pattern="^(.+)@(.+)$";
		if(email.matches(pattern)&&(email.trim().length()>=5)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean usernameValidation(String username) {
		if((!username.isEmpty())&&(username.trim().length()>=3)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean passwordValidation(String password) {
		String pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		if(password.matches(pattern)&&(password.trim().length()>=7)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean nationalityValidation(String nationality) {
		String pattern = "^[a-zA-Z\\s]+";
		if (nationality.matches(pattern)&&(nationality.trim().length()>=3)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean bookNameValidation(String name) {
		String pattern = "^[A-Z\\s]+";
		if (name.matches(pattern)&&(name.trim().length()>=3)) {
			return true;
		} else {
			return false;
		}

	}
	
	
	

}
