package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.UserService;


@RestController // @Controller + @ResponseBody
public class UserController {
	
//	@RequestMapping("/")
	//@ResponseBody
//	String hello() {
//		return "Hello, Welcome";
//	}
//	
//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}
//
//	@GetMapping("/game")
//	public String test() {
//		return "bye";
//	}
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping("/")
	public ModelAndView index (Model model) {
		User user = new User();
		model.addAttribute("user",user);
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login");
	    return modelAndView;
	}
	
	@PostMapping("/userlogin")
	public ModelAndView userlogin(@ModelAttribute("user") User user) {
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
//		String uname = user.getUsername();
//		String pass = user.getPassword();
//		repo.save(user);
//		Optional<User> userdata = repo.findbyUsername(uname);
		ModelAndView modelAndView = new ModelAndView();

		if(user.getUsername().equals("admin") && user.getPassword().equals("root")){
		    modelAndView.setViewName("dashboard");
		    return modelAndView;
		}
		else {
		    modelAndView.setViewName("error");
	    	return modelAndView;
		}
//		return uname+" "+pass;
//		 modelAndView.setViewName("error");
//	    	return modelAndView;
		
	}
	
//	
//	@RequestMapping("/signup")
//	public ModelAndView signup () {
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("signup");
//	    return modelAndView;
//	}
	
}