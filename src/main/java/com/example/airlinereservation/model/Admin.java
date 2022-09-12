package com.example.airlinereservation.model;

public class Admin {
 private String adminUsername="AdminLogin";
 private String adminPassword="Admin@1234";
public String getAdminUsername() {
	return adminUsername;
}
public String getAdminPassword() {
	return adminPassword;
}
@Override
public String toString() {
	return "Admin [adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
}
}
