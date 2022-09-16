package com.example.airlinereservation.model;

public class Admin {
 private String adminUsername="AdminLogin";
 private String adminPwd="Admin@1234";
public String getAdminUsername() {
	return adminUsername;
}
public String getAdminPwd() {
	return adminPwd;
}
@Override
public String toString() {
	return "Admin [adminUsername=" + adminUsername + ", adminPassword=" + adminPwd + "]";
}
}
