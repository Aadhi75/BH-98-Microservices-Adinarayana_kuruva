package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Leaves;
import com.example.demo.service.LeavesService;



@RestController
@CrossOrigin(origins = "*")
public class LeavesController 
{
	@Autowired
	private LeavesService leavesService;
	@GetMapping("/leaves")
	List<Leaves> getAll()
	{
		return leavesService.getAll();
	}
	@GetMapping("/leaves/{empId}/{year}/{month}")
	Leaves getLeaves(@PathVariable Long empId,@PathVariable int year,@PathVariable int month)
	{
		return leavesService.getLeaves(empId,year,month);
	}

	@PostMapping("/leaves")
	Leaves save(@RequestBody Leaves leaves)
	{
		return leavesService.saveLeaves(leaves);
	}
}