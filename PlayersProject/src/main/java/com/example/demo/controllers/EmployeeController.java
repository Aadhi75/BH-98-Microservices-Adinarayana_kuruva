package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eservice;
	
	@PostMapping("/newemployee")
	public ModelAndView newEmployee(@ModelAttribute("allemployees") Employee employee) {
		eservice.save(employee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dashboard");
		return mv;
	}
	@GetMapping("/employee_list")
	public ModelAndView allEmployees(Model model) {
//		List<Employee> listEmployees = eservice.getall();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employee_list");
		model.addAttribute("listEmployees", eservice.getall());
		return mv;
	}
	
	@RequestMapping("/create_employee")
	public ModelAndView createEmployees(@ModelAttribute("allemployees") Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create_employee");
		return mv;
	}
	
	@RequestMapping("/dashboard")
	private ModelAndView dashboard(@ModelAttribute("allemployees") Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dashboard");
		return mv;
	}
	
//	@GetMapping("/employee_list")
//	private ModelAndView employees(Model model) {
//		List<Employee> listEmployees = eservice.getall();
//		model.addAttribute("listEmployees", listEmployees);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("employee_list");
//
//		return mv;
//	}
	
	
	@RequestMapping("/update_employee")
	public ModelAndView updateemployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("update_employee");
		return mv;
	}
	
	@GetMapping("/checking")
	List<Employee> get(){
		return eservice.getall();
	}
	
}
