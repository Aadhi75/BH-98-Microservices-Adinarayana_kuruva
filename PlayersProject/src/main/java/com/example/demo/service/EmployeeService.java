package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository erepo;

	public void save(Employee employee) {
		erepo.save(employee);
		
	}

	public List<Employee> getall() {
		return erepo.findAll();
		
	}

}
