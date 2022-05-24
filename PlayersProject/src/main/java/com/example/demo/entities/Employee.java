package com.example.demo.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
//@Table(name="AllEmployees")
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String email;
	private String address;
	private String department;
	private String contactNo;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)        
    private LocalDateTime joiningdt;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, String email, String address, String department, String contactNo,
			LocalDateTime joiningdt, int salary) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.department = department;
		this.contactNo = contactNo;
		this.joiningdt = joiningdt;
		this.salary = salary;
	}


	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDateTime getJoiningDate() {
		return joiningdt;
	}
	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningdt = joiningDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", department="
				+ department + ", contactNo=" + contactNo + ", joiningdt=" + joiningdt + ", salary=" + salary + "]";
	}

	
	
	

}
