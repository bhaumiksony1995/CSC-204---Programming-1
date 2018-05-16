import java.util.*;

public class Convertname {
//  CSC 204 Lab 5: Using classes
//  Written by:
//  Date: 
//  This program illustrates some of the operations in the String class.

   public static void main (String arg [])
   {
    //  Declare and read a string.
      String S;
      Scanner stdin = new Scanner(System.in);
      S = stdin.nextLine();


   //  Find the location of the first double quote (") in the String,
   //  using indexOf.
      int index = S.indexOf("\"");

   //  Take a substring from the first character (in position 0) to the
   //  location you found in the previous step.  You'll need to use the version
   //  of substring with two parameters.  Call the substring firstName.
      String FirstName = S.substring(0, index);

   //  Trim the blank spaces off the ends of firstName, using the trim
   //  method.
      FirstName = FirstName.trim();

   //  Find the location of the last double quote (") in the String, using
   //  lastIndexOf.
      int LastIndex = S.lastIndexOf("\"");

   //  Take a substring from the space after the last double quote (whose
   //  position you found in the previous step) to the end of the string.
   //  You'll can use the version of substring with one parameter.  Call this
   //  substring lastName.
      String LastName = S.substring(LastIndex + 1);

   //  Trim the blank spaces off the ends of lastName, using the trim
   //  method.
      LastName = LastName.trim();

   //  Create and print a new string consisting of the first name, a
   //  single space, and the last name.
      System.out.print(FirstName + " " + LastName);

   }
}
