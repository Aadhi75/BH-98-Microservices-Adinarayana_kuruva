package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Leave;
import com.example.demo.service.LeaveService;

@RestController
public class LeaveController {
	
	@Autowired
	private LeaveService lservice;
	
	@PostMapping("/allleaves")
	public ModelAndView newEmployee(@ModelAttribute("leave") Leave leave) {
		lservice.save(leave);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dashboard");
		return mv;
	}
	
	@GetMapping("/leaves")
	public ModelAndView newEmployee(Model model) {
		model.addAttribute("listleaves", lservice.getall()) ;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("leaves");
		return mv;
	}
	
	
	@RequestMapping("/create_leaves")
	public ModelAndView createleaves() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create_leaves");
		return mv;
	}
	

}
