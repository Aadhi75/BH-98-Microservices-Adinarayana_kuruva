package com.example.demo;

public class Student {
	private String name;
	private Long marks;
	
	public Student(String name, Long marks) {
		super();
		this.name = name;
		this.marks = marks;
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

}
