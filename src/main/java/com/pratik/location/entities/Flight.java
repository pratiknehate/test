package com.pratik.location.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="p_flight")
public class Flight  extends AbstractEntity{
	
	@Column(name="flightnumber")
	private String flightnumber;
	@Column(name="operatingairline")
	private String operatingairline;
	@Column(name="departurecity")
	private String departurecity;
	@Column(name="arrivalcity")
	private String arrivalcity; 
	@Column(name="dateofdeparture")
	private String dateofdeparture;
	@Column(name="estimateddeparturetime")
	private String time;
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOperatingairline() {
		return operatingairline;
	}
	public void setOperatingairline(String operatingairline) {
		this.operatingairline = operatingairline;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public String getDateofdeparture() {
		return dateofdeparture;
	}
	public void setDateofdeparture(String dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
 
	
}
