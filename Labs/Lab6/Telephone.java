
import java.util.*;

public class Telephone
{
  public static void main(String[] args)
  {
        System.out.println("\t\t\7@@@@@@ THE TELEPHONE PAD CONVERTER @@@@@@\n");
	System.out.println("\t Software that converts letters into telephone" +
		           " digits!\n\n");
	char response;
	do {
	System.out.print("\t Please enter an character (not case sensitive)  ==> ");
	Scanner stdin = new Scanner (System.in);
	String userInput = stdin.nextLine();
        System.out.println("");
	// Use the String method charAt to convert our input into a char
	char letter = userInput.charAt(0);
        
	// Complete the Program HERE using a Nested-If Statement	
        int digit = 0;

	if ((letter == 'A') || (letter == 'B') || (letter == 'C') || (letter == 'a') || (letter == 'b') || (letter == 'c'))
		{
			digit = 2;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'D') || (letter == 'E') || (letter == 'F') || (letter == 'd') || (letter == 'e') || (letter == 'f')) 
		{
			digit = 3;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'G') || (letter == 'H') || (letter == 'I') || (letter == 'g') || (letter == 'h') || (letter == 'i'))
		{
			digit = 4;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'J') || (letter == 'K') || (letter == 'L') || (letter == 'j') || (letter == 'k') || (letter == 'l'))
		{
			digit = 5;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'M') || (letter == 'N') || (letter == 'O') || (letter == 'm') || (letter == 'n') || (letter == 'o'))
		{
			digit = 6;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'P') || (letter == 'R') || (letter == 'S') || (letter == 'p') || (letter == 'r') || (letter == 's'))
		{
			digit = 7;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'T') || (letter == 'U') || (letter == 'V') || (letter == 't') || (letter == 'u') || (letter == 'v'))
		{
			digit = 8;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'W') || (letter == 'X') ||  (letter == 'Y') || (letter == 'w') || (letter == 'x') || (letter == 'y')) 
		{
			digit = 9;
			System.out.println("\t The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
		}
	else if ((letter == 'Q') || (letter == 'Z') || (letter == 'q') || (letter == 'z'))
		{
			digit = 10;
			System.out.println("\t The letter " + letter + " does not correspond to any number of the telephone.");
		}
	System.out.print("Would you like to try another letter? (Y or N) ");
        response = (stdin.nextLine()).toUpperCase().charAt(0);
	}while (response != 'N');
	//System.out.print("Would you like to try another letter? (Y or N) ");
	//response = (stdin.nextLine()).toUpperCase().charAt(0);
 }	
}
