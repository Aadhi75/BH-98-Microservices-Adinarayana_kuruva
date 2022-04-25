package BasicsQuiz;

import java.util.Scanner;

class Values{
	private int f;
	private int s;
	Values(int f , int s){
		this.f = f;
		this.s = s;
		
	}
	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	
}

public class Calculator {

	void Result(int cal , Values v) {
		
		if(cal==0)
			All(v.getF(),v.getS());
		else if(cal==1)
			System.out.println(Add(v.getF(),v.getS()));
		else if(cal==2)
			System.out.println(Sub(v.getF(),v.getS()));
		else if(cal==3)
			System.out.println(Mul(v.getF(),v.getS()));
		else if(cal==4)
			System.out.println(Div(v.getF(),v.getS()));
		else
			System.out.println("Invalid Input...");
	}

	int Add(int f , int s) {
		return f+s;
	}
	int Sub(int f , int s) {
		return f-s;
	}
	int Mul(int f , int s) {
		return (f*s);
	}
	int Div(int f , int s) {
		return f/s;
	}
	void All(int f , int s) {
		System.out.println("Addition: "+(f+s));
		System.out.println("Subtraction: "+(f-s));
		System.out.println("Multiplication: "+f*s);
		System.out.println("Division: "+f/s);
	}

	
	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int f = an.nextInt();
		System.out.print("Enter the Second Number: ");
		int s = an.nextInt();
		System.out.print("Enter 1 for Addition \nEnter 2 for Subtraction \nEnter 3 for Multiplication \nEnter 4 for Division \nEnter 0 for All \nEnter the Value: ");
		int cal = an.nextInt();
		Values v1 = new Values(f , s);
		Calculator c = new Calculator();
		c.Result(cal , v1);
	
	}

}
