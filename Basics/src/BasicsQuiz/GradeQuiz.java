package BasicsQuiz;

import java.util.Scanner;


//public class GradeQuiz {
//
//	public static void main(String[] args) {
//		Scanner an = new Scanner(System.in);
//		System.out.println("Enter the Marks: ");
//		int marks = an.nextInt();
//		
//		if(marks>100)
//			System.out.println("Invalid Marks...!!!");
//		else if(marks>90)
//			System.out.println("A");
//		else if(marks>80)
//			System.out.println("B");
//		else if(marks>70)
//			System.out.println("C");
//		else
//			System.out.println("Fail");
//
//	}
//
//}

class Student{
	private String name;
	private int marks;
	int rollNo;
	
	Student(String name , int marks){
		this.name = name;
		this.marks = marks;
	}
	Student(int rollNo , String name){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
public class GradeQuiz{
	
	static void Grade(Student s){
	
		if(s.getMarks()>100)
			System.out.println("Invalid Marks...!!!");
		else if(s.getMarks()>=90)
			System.out.println("Name : "+s.getName()+ " \n"+"Grade : A");
		else if(s.getMarks()>=80)
			System.out.println("Name : "+s.getName()+ " \n"+"Grade : B");
		else if(s.getMarks()>=70)
			System.out.println("Name : "+s.getName()+ " \n"+"Grade : C");
		else
			System.out.println("Fail");
	}
	
	public static void main(String[]args) {
		Scanner an = new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name = an.nextLine();
//		an.next();
		System.out.print("Enter the Marks: ");
		int marks = an.nextInt();
		Student s = new Student(name , marks);
		Grade(s);
	}
}
