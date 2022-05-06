package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
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
	private StudentRepository studentRepository;
	
	@PostMapping("/student")
	
	public Student save(@RequestBody Student student)
	{
		return studentService.studentGrade(student);
	}
	
	@GetMapping("/allstudents")
	List<Student> allStudents()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	Optional<Student> studentById(@PathVariable Long id){
		return studentRepository.findById(id);
	}
	
	@DeleteMapping("/student/{id}")
	void deleteById(@PathVariable Long id){
		studentRepository.deleteById(id);
	}
	
	@PutMapping("/student/{id}")
	Student updateUser(@PathVariable Long id,@RequestBody Student s) {
		return studentRepository.findById(id).map(
				student ->{
					student.setName(s.getName());
					return studentRepository.save(student);
				}).orElseGet(() ->{
					s.setId(id);
					return studentRepository.save(s);
				});
	}
		
//	@GetMapping("/student/grade/{id}")
//	String studentGradeById(@PathVariable Long id){
//		Optional<Student> st = studentRepository.findById(id);
//		return st.grade(st.getMarks());
//	}
	
}
