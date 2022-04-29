package com.example.demo;


import org.springframework.stereotype.Service;
import com.example.demo.Student;
@Service
public class StudentService {
	//@Autowired
//		Student std = new Student();
		
	  private final StudentRepository studentRepository;
		
		StudentService(StudentRepository studentRepository)
		{
			this.studentRepository=studentRepository;
		}

public Student totalStudent(Student student) {
		String grade = student.grade(student.getMarks());
		student.setGrade(grade);
		return  studentRepository.save(student);
	}
}
