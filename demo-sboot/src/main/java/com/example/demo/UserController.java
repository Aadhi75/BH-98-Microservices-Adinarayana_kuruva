package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	private final UserRepository userRepository;
	
	UserController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	List<User> getAll(){
		return userRepository.findAll();
	}
	
	@Autowired
    private	StudentService studentService;
	
	@Autowired
	private StudentRepository studentRpository;
	
	@PostMapping("/Student")
	
	public Student save(@RequestBody Student student)
	{
		//std.gradeCal(student.getMarks());
		return studentService.totalStudent(student);
	}
	
	@GetMapping("/AllStudents")
	List<Student> allStudents()
	{
		return studentRpository.findAll();
	}
		
	
}
