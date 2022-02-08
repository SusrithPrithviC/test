package com.flight_reservation_app_1.enitities;



import javax.persistence.Entity;


@Entity
public class Flight extends AbstractEntity {
	
	private String flightId;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private String dateOfDeparture;
	
	
	
	
	


	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	

}

	
