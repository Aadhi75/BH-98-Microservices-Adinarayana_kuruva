package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private final UserRepository userrepo;

	public UserService(UserRepository userrepo) {
		this.userrepo = userrepo;
	}
	
}
