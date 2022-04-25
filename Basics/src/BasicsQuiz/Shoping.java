package BasicsQuiz;

//		2. Create one command line application for ordering pizza, it should have menu with price, 
//		checkout option after adding pizza with respective quantity. 
//		Take user choice for order and process final bill at checkout.

import java.util.Scanner;

public class Shoping {

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		System.out.println("-------Welcome to the Online Resturant-----\n");
		System.out.println("1.Pizza   ----- 250/- \n2.Burger  ----- 150/- \n3.Chicken ----- 200/-");
		System.out.print("Enter Your Order Id: ");
		int id = an.nextInt();
		System.out.print("Enter Quantity: ");
		int q = an.nextInt();
		
		switch(id) {
		case 1 : System.out.println("Your Bill is 250/- * "+q+" = "+(250*q) + "\nThank You for Ordering Pizza.\nYour Order is Processing...");break;
		case 2 : System.out.println("Your Bill is 150/- * "+q+" = "+(150*q) + "\nThank You for Ordering Burger.\nYour Order is Processing...");break;
		case 3 : System.out.println("Your Bill is 200/- * "+q+" = "+(200*q) + "\nThank You for Ordering Chicken.\nYour Order is Processing...");break;
		default : System.out.println("Sorry, Invalid Order....");
		
		}
	}

}
