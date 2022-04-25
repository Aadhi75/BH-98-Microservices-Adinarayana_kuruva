package BasicsQuiz;

import java.util.Scanner;

class CheckPrime{
	private int n;
	
	CheckPrime(int n){
		this.n = n ;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}

public class Prime {
	
	void Checking(CheckPrime c1) {
		int c = 0 ;
		for(int i = 2 ; i<c1.getN() ; i++) {
			if(c1.getN()%i==0)
				c++;
		}
		if(c==0)
			System.out.println("Yes, It is Prime Number.");
		else
			System.out.println("No, It is Not Prime Number.");
	}
	

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = an.nextInt();
		CheckPrime c =new CheckPrime(num);
		Prime p = new Prime();
//		System.out.print(c.Checking(num));
		p.Checking(c);
	}

}

