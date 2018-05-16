import java.util.*;

public class TestFract {
//  CSC 204 Lab 5: Using classes
//  Written by:
//  Date: 
//  This program illustrates some of the operations in the Fraction class.

   public static void main (String arg [])
{
	String f1, f2;
	Scanner stdin = new Scanner(System.in);
	int f1numerator, f2numerator, f1denominator, f2denominator;
	System.out.print("Enter the the first fraction: ");
	f1 = stdin.nextLine();
	System.out.print("Enter the the second fraction: ");	
	f2 = stdin.nextLine();	
	System.out.println("");
	
	int f1index = f1.indexOf('/');
	int f2index = f2.indexOf('/');
	
	f1numerator = Integer.parseInt(f1.substring(0, f1index).trim());
	f1denominator = Integer.parseInt (f1.substring(f1index + 1).trim());
	f2numerator = Integer.parseInt(f2.substring(0, f2index).trim());
	f2denominator = Integer.parseInt(f2.substring(f2index + 1).trim());
	
	Fraction nf1 = new Fraction (f1numerator, f1denominator); 
	Fraction nf2 = new Fraction (f2numerator, f2denominator); 
	
	System.out.println("The first fraction is " + f1numerator + "/" + f1denominator);
	System.out.println("The second fraction is " + f2numerator + "/" + f2denominator);
	Fraction result;
	result = nf1.add (nf2);
	System.out.println("The sum is " + result);

	Fraction difference;
	difference = nf1.subtract (nf2);
	System.out.println("The difference is " + difference);

	Fraction product;
	product = nf1.multiply (nf2);
	System.out.println("The product is " + product);

	Fraction quotient;
	quotient = nf1.divide (nf2);
	System.out.println("The quotient is " + quotient);
   }
}
