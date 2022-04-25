package BasicsQuiz;

import java.util.Scanner;
class Check{
	private int n;
	
	Check(int n) {
		this.n =n;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n =n ;
	}
}

public class EvenOdd {
	
	String Checking(Check c) {
		if(c.getN()%2==0)
			return "Yes , It is Even Number";
		else
			return "No , It is Not Even Number";
	}

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = an.nextInt();
		Check c = new Check(num);
		EvenOdd e = new EvenOdd();
		System.out.print(e.Checking(c));

	}

}
