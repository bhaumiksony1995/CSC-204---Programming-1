//Programmer : Bhaumik Sony
//Class : CSC204
//Title : Change Program
//Program Specification : A clerk enters a amount due for a bill and the tendered amount the customer gives him/her, then the program determines the change due and how to split the change in terms of bills
//Input : Two integers (total due and amount received)
//Output : Seven integers (change due plus the appropriate number // of hundreds, fifties, twenties, tens, fives, and // ones to be distributed)

import java.util.*;

	public class change 
	{ 
		public static void main(String[] args) 
		{ 
			int total, tendered, change, changeLeft; 
			int hundreds, twenties, fifties, tens, fives, ones;

			Scanner stdin = new Scanner(System.in);

//Prompt user for Total Due, Input Amt, & Store as int System.out.print("\nTotal Due (in dollars) : $"); total = stdin.nextInt();
			System.out.print("\n-----------------------------------------");
			System.out.print("\nTotal Due (in dollars) : $"); 
			total = stdin.nextInt();
			System.out.print("-----------------------------------------");
	
//Prompt user for Tendered Amount, Input Amt, & Store as int	
			System.out.print("\n-----------------------------------------");
			System.out.print("\nTendered amount (in dollars) : $"); 
			tendered = stdin.nextInt();
			System.out.println("-----------------------------------------");
			System.out.println("");
			System.out.println("");
//Calculate Change Due HERE
			change = tendered - total;

//Output Amount of Change Due HERE
			System.out.println("******************************************");
			System.out.println("    Amount of change (in dollars) : $" + change);
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("");

//Calculate different change values per bill
			hundreds = change / 100;
        			changeLeft = change % 100;
		        fifties = changeLeft / 50;
        			changeLeft = changeLeft % 50;
        		twenties = changeLeft / 20;
        			changeLeft = changeLeft % 20;
        		tens = changeLeft / 10;
        			changeLeft = changeLeft % 10;
        		fives = changeLeft / 5;
        			changeLeft = changeLeft % 5;
        		ones = changeLeft / 1;
        			changeLeft = changeLeft % 1;

//Output How Change Should Be Distributed HERE
			System.out.println("******************************************");
			System.out.println("    How change should be distributed");
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("            Number of Hundreds => " + hundreds); 
			System.out.println("             Number of Fifties => " + fifties);
			System.out.println("            Number of Twenties => " + twenties);
			System.out.println("                Number of Tens => " + tens);
			System.out.println("               Number of Fives => " + fives); 
			System.out.println("                Number of Ones => " + ones);
			System.out.println("");
			System.out.println("******************************************");
	}

}
