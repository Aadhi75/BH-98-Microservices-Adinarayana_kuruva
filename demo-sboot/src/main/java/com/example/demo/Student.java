package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	private @Id Long id;
	private String name;
	private Long marks;
	private String grade;
	
	public Student() {
	}

	public Student(String name, Long marks) {
		this.name = name;
		this.marks = marks;
	}



	public Student(Long id, String name, Long marks, String grade) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	String grade(){
		if(getMarks()>100)
			return "Sorry, Invalid marks";
		else if(getMarks()>=90)
			return "Student name is "+getName()+" and Grade is A.";
		else if(getMarks()>=80)
			return "Student name is "+getName()+" and Grade is B.";
		else if(getMarks()>=70)
			return "Student name is "+getName()+" and Grade is C.";
		else if(getMarks()>=60)
			return "Student name is "+getName()+" and Grade is D.";
		else
			return "Student name is "+getName()+" and Fail in exam.";
	}
	
	String grade(Long marks){
		if(getMarks()>100)
			return "Invalid marks";
		else if(getMarks()>=90)
			return "A";
		else if(getMarks()>=80)
			return "B";
		else if(getMarks()>=70)
			return "C";
		else if(getMarks()>=60)
			return "D";
		else
			return "Fail";
	}

}
