package com.example.AirLineReservation.alrmodel;

public class Airline {

	private String airLineId;
	private String airLineName;

	public String getAirLineId() {
		return airLineId;
	}

	public void setAirLineId(String airLineId) {
		this.airLineId = airLineId;
	}

	public String getAirLineName() {
		return airLineName;
	}

	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}

	@Override
	public String toString() {
		return "Airline [airLineId=" + airLineId + ", airLineName=" + airLineName + "]";
	}
}
