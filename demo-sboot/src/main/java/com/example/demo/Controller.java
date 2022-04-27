package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello, Welcome to this page";
	}
	
	@RequestMapping("/calculator/{num1}/{num2}")
	String calculator(@PathVariable long num1 , @PathVariable long num2) {
		return "Addition = "+(num1+num2)+" Subtraction = "+(num1-num2)+"\nMultiplication = "+(num1*num2)+"\nDivison = "+(num1/num2);
	}

	@RequestMapping("/grade/{name}/{marks}")
	String grade(@PathVariable String name , @PathVariable long marks) {
		Student st = new Student(name,marks);
		return st.grade();
	}
	
}
