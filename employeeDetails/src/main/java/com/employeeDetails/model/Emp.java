package com.employeeDetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
	@Id
	private int empid;
	private String name;
	private String shift;
	private String position;
	private int dpd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getDpd() {
		return dpd;
	}
	public void setDpd(int dpd) {
		this.dpd = dpd;
	}
	

}
