package com.example.airlinereservation.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginException extends Exception{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4695616978491147011L;
	Logger logger = LoggerFactory.getLogger(LoginException.class);
	 
	 public void exceptionProcess() {
		 logger.info("Exception Raised!Account Not found");
	 }
	
}
