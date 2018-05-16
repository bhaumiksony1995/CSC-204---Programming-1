import java.util.*;

public class Myfirst
{
	public static void main (String [] args)
		{
			//Variable used in this program
			String personName;

			personName = getName(); // calling value-returning method getName
			printOut (personName); // calling void method printOut
		}

private static String getName()
	{
		// this method will get the name of he user and return it to the main function
		
		Scanner stdin = new Scanner (System.in);
		System.out.print("Please enter your first name : ");
		String userInput = stdin.next();

		return userInput;
	}

private static void printOut(String personName)
	{
		// This method wil print a congratulatory message to a person with the name personName
		
		System.out.println("\nCongratulations " + personName + " on running your first Java program!!!\n\n");
	}
}
