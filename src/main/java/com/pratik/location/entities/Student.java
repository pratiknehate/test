package com.pratik.location.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	
	@Id
	private int id;
	private String sname;
	private String scourse;
	private Double sfee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public Double getFee() {
		return sfee;
	}
	public void setFee(Double fee) {
		this.sfee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", scourse=" + scourse + ", fee=" + sfee + "]";
	}
	
}
