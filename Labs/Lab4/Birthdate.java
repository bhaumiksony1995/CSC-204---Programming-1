import java.util.*;

public class Birthdate
{
        public static void main(String[] args)
        {
		//Declare Main Variable
		System.out.print ("Please enter a 6-digit birthdate (ex. 032580): ");
		Scanner stdin = new Scanner(System.in);
		
		//Get Birthdate from user
		int Birthdate = stdin.nextInt();

		//Declare Other Variables and calculate them
		int Month = Birthdate / 10000 ;
		int Day = Birthdate / 100 % 100;
		int Year = Birthdate % 100;

		//Display date in Month, Date, Year combo
		System.out.println ("Month = " + Month);
		System.out.println ("Day = " + Day);
		System.out.println ("Year = 19" + Year);

	}
}
