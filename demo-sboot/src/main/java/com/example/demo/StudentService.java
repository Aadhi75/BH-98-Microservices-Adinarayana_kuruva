package com.example.demo;


import org.springframework.stereotype.Service;
import com.example.demo.Student;
@Service
public class StudentService {
		
	  private final StudentRepository studentRepository;
		
		StudentService(StudentRepository studentRepository){
			this.studentRepository=studentRepository;
		}

		public Student studentGrade(Student student) {
			String grade = student.grade(student.getMarks());
			student.setGrade(grade);
			return  studentRepository.save(student);
		}
//		
//		public String getStGrade(Long id) {
//			Student st = studentRepository.getById(id);
//			return grade(st.getMarks());
//		}
}
