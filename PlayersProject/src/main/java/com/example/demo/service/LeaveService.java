package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Leave;
import com.example.demo.repositories.LeaveRepository;

@Service
public class LeaveService {
	
	@Autowired
	private LeaveRepository lrepo;

	public void save(Leave leave) {
		lrepo.save(leave);
		
	}

	public List<Leave> getall() {
		return lrepo.findAll();
		
	}

}
