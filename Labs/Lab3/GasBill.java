
// Author :  Your Name
// Title  :  The GasBill Program

// Input  :  Two integers representing present & previous meter readings 
// Output :  The two integers input will be echoed onto screen with prompts,
//           along with the CCF used.  Three doubles representing the 
//           BTU factor, therms used, and current amount will follow.

import java.util.*;

public class GasBill  {

	public static void main(String [] args)
	{
	 // Declare your four constants HERE
	
	 double BASE_CHARGE = 22.53;
	 double BTU_FACTOR = 1.026;
	 double PRICE_PER_THERM = 0.3623;
	 double SALES_TAX = 1.07;
	
	 // Prompt and input present meter reading
         System.out.println("\nAtlanta Gas Light Company Billing System\n");
	 System.out.print("Enter present meter reading:  ");
         Scanner stdin = new Scanner(System.in);
	 int presentRead = stdin.nextInt();

         // Prompt and input previous meter reading
	 System.out.print("Enter previous meter reading: ");
	 int previousRead = stdin.nextInt();

	 // Declare and calculate CCFs used 
	 int CCFused = presentRead - previousRead;

	 // Declare and calculate thermsUsed
	 double thermsUsed = CCFused * BTU_FACTOR;

	 // Declare and calculate consumption charge
	 double consumptionCharge = thermsUsed * PRICE_PER_THERM;
	 
	 // Declare and calculate total charges
	 double totalCharges = (BASE_CHARGE + consumptionCharge) * SALES_TAX;
	 double roundedAmount = Math.round(totalCharges * 100) / 100.0;
	 
	 // All output statements go HERE
	 System.out.println("\nPresent reading (" + presentRead + ") -  previous reading (" + previousRead + ") = CCF used (" + CCFused + ")");
	 System.out.println("\nCCF used (" + CCFused + ") x BTU factor (" + BTU_FACTOR + ") = therms used (" + thermsUsed + ")");
	 System.out.println("\nCurrent gas amount: $" + roundedAmount);
	 System.out.println("       (includes tax, base charge, and consumption charge)");








         }
}
