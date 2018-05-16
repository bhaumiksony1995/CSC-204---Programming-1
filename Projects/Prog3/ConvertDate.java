// Author  : Bhaumik Sony
// Program : Date conversion 
// Input   : One string representing a date in the format month day, year from the keyboard
// Ouput   : One string output to the screen representing he input day with the actual day of the week converted in the format//           dayOfweek, month day, year

import java.util.*;

public class ConvertDate
{
	public static void main (String [] args)
	{
		Scanner stdin = new Scanner(System.in);
		//Get date to be converted from keyboard
		System.out.print("Please enter date to be converted (month day, year) : ");
		String inputDate = stdin.nextLine();
		
		//Trim the date and make everything lowercase, take off first letter and uppercase it
		inputDate = inputDate.trim().toLowerCase();		
		String FirstLetter = inputDate.substring(0,1).toUpperCase();
		inputDate = FirstLetter + inputDate.substring(1);
		
		//Split the string into its seperate section: month, day, and year
		String month = inputDate.substring(0, inputDate.indexOf(" ")); 
		String year = inputDate.substring(inputDate.indexOf(",") + 2);
		String day = inputDate.substring(inputDate.indexOf(" ") + 1, inputDate.indexOf(","));
			
		//Parse out the year and day then convert to a string
		int Year = Integer.parseInt(year);
		int Day = Integer.parseInt(day);
		//Declare and assign Zeller's congruence variables
		int J = Year / 100;
		int K = Year % 100;
		int m = -1;
		int q = Day;
		
		//Put if else statement for variable m here
		if (month.equals("January"))       
		 	{
				m = 13;
				K--;
				if (K == -1)
					{
						K = 99;
						J = J - 1;
					}
				if (J == -1)
					{
						J = 99;
						K = K - 1;
					}
			}			
                else if (month.equals("February"))
                        {
				m = 14;
				K--;
				if (K == -1)
					{	
						K = 99;
						J = J - 1;
					}
				if (J == -1)
					{
						J = 99;
						K = K - 1;
					}
			}			
                else if (month.equals("March"))
                        m = 3;
                else if (month.equals("April"))
                        m = 4;
                else if (month.equals("May"))
                        m = 5;
                else if (month.equals("June"))
                        m = 6;
                else if (month.equals("July"))
                        m = 7;
                else if (month.equals("August"))
                        m = 8;
                else if (month.equals("September"))
                        m = 9;
                else if (month.equals("October"))
                        m = 10;
                else if (month.equals("November"))
                        m = 11;
                else if (month.equals("December"))
                        m = 12;

		//Zeller's Congruence Formula
		int h = (q + 26 * (m+1) / 10 + K + K/4 + J/4 + 5 * J)%7;
		
		//dayOfWeek if statement goes here
		String dayOfWeek = "";
		if (h == 0)
			dayOfWeek = "Saturday";
		else if (h == 1)
			dayOfWeek = "Sunday";
		else if (h == 2)
			dayOfWeek = "Monday";
		else if (h == 3)
			dayOfWeek = "Tuesday";
		else if (h == 4)
			dayOfWeek = "Wednesday";
		else if (h == 5)
			dayOfWeek = "Thursday";
		else if (h == 6)
			dayOfWeek = "Friday";
		//Print the CONVERTED DATE to the screen
		System.out.println("Converted date: " + dayOfWeek + ", " + month + " " + day + ", " + Year);
	}
}
