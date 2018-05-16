
import java.util.*;
import java.io.*;
public class Crypt
{
   public static void main(String[] args)
   {
	char sel, type;
        int displace;
        String ifilename = "", ofilename = "";
	do
	{
		intro();
 		displace = getPassword();
	
		System.out.print("Source File ==> ");
		ifilename = getFileName("Source File  ==> ");

		type = getType();  // get Crypt Type
		
		System.out.print("Output File ==> ");
                ofilename = getFileName("Output File  ==> ");

		crypt (ifilename, ofilename, displace, type);
                sel = rerunPrompt ();
		System.out.println();
	} while (sel != 'N');

	System.out.println("\t\t\10" + "   !!! Exiting Security System !!!\7");
   }

   private static void intro()
   {	// Prints the welcome message
	System.out.println("====================================");
	System.out.println("     TEXT FILE SECURITY SYSTEM");
	System.out.println("====================================");
   }

   private static int getPassword()
   {	// Inputs the password
	int n = 0;
	int n2 = 0;
	Scanner stdin = new Scanner(System.in);	
	// Prompt user to enter password
	System.out.print("\nPlease Enter Your Password: ");
	String password = stdin.nextLine();
	System.out.println();
	// Add the ascii values of the characters and calculate the displacement value
	for (n = 0; n < password.length(); n++)
		{
			n2 = n2 + password.charAt(n);
		}
	n = n2 % 96;
	return n;
   }

   private static String getFileName(String prompt)
   {	// Prompt the user for the filename using the parameter as the prompt message
	Scanner stdin = new Scanner(System.in);
	prompt = stdin.nextLine();
	System.out.println();
	return prompt;
   }

   private static char getType()
   {	// Prompt user to enter either E to encrypt or D to decrypt
	String type_;
	boolean type;
	boolean realtype;
	do {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Encrypt or Decrypt? (E/D) ");
		type_ = scanner.nextLine().toUpperCase();
		System.out.println();
		realtype = type = type_.equals("E") || type_.equals("D");
	if (realtype) continue;
		System.out.println("\t Invalid Selection -- Please Try Again.");
 	   } 
	while (!realtype);

 	return type_.charAt(0);
   }

   private static void crypt(String ifilename, String ofilename, int displace, char type)
   {	// Encrypts the file in ifilename and outputs it to ofilename

	try {
	   // Create input and output file objects to work with
           Scanner in = new Scanner(new File(ifilename));
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ofilename)));

	   int coef = (type == 'E') ? 1 : -1;
	   
	   // Loop until end of file...read a line, encrypt it character by character, and 
	   // write the line to the output file
	   String line;
	   char ch;
	   int linesProcessed = 0, charsCrypted = 0;
	   while(in.hasNext())
	   {
		line = in.nextLine();
		
		// Encrypt the line
		for (int i = 0; i < line.length(); i++)
		{
		   if (line.charAt(i) != '\t')
		   {
			int ascii = (int) line.charAt(i) + (displace * coef);

			// Keep printable characters
			if (coef == 1)
			{
			   if (ascii > 126)
				ch = (char) (ascii - 126 + 31); 
                           else
                                ch = (char) (ascii);
			}
			else
		  	   if (ascii < 32)
				ch = (char) (127 - (32 - ascii));
                           else
                                ch = (char) (ascii);

			line = line.substring(0, i) + ch + line.substring(i + 1);
			charsCrypted++;
		   }
		}	   

		// Write the line to the output file
		out.println(line);
		linesProcessed++;
	   }
	   
	   in.close();
	   out.close();
	   System.out.println("\t\t\t   Lines processed :  " + linesProcessed +
			    "\n\t\t\tCharacters crypted :  " + charsCrypted);

	}
	catch (IOException e)
	{
	   System.err.println(e.getMessage());
	}
   }


   private static char rerunPrompt()
   {	// Prompt the user to enter Y to go again or N to stop
	Scanner stdin = new Scanner(System.in);
	boolean input;
	char character;
	boolean realinput;
	do
		{
			System.out.print("\n\t\tWould you like to try another file? (Y or N): ");
			String input_ = stdin.nextLine().toUpperCase();
			character = input_.charAt(0);
			realinput = input = character == 'Y' || character == 'N';
			if (realinput) continue;
			System.out.print("\t You have entered an invalid selection, please try again");
		}
	while (!realinput);
	return character;
   }
	
}
