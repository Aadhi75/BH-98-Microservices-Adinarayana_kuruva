package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class Controller {
	
	@RequestMapping("/")
	//@ResponseBody
	String hello() {
		return "Hello, Welcome to this page";
	}
	
	@RequestMapping("/calculator/{num1}/{num2}")
	String calculator(@PathVariable long num1 , @PathVariable long num2) {
		return "Addition = "+(num1+num2)+" Subtraction = "+(num1-num2)+"\nMultiplication = "+(num1*num2)+"\nDivison = "+(num1/num2);
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}

	
}