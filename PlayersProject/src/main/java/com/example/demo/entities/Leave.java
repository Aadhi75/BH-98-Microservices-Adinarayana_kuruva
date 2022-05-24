package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leaves")
public class Leave {
	
	@Id
	@GeneratedValue
	private long id;
	private long empid;
	private String month;
	private int year;
	private int numberOfDays;
	
	public Leave() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	@Override
	public String toString() {
		return "Leave [id=" + id + ", empid=" + empid + ", month=" + month + ", year=" + year + ", numberOfDays="
				+ numberOfDays + "]";
	}

	
	

}
