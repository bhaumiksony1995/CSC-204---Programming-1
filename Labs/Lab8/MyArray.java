
import java.util.*;

public class MyArray
{
  final static int NUM_ITEMS = 6;

  public static void main(String[] args)
  {
	int[] a = new int[NUM_ITEMS];

	fillUp (a);

	printOut (a);

	System.out.println("\nArray Sum :  " + sumUp(a));
	System.out.println("Num of Positive Values :  " + posCount(a));
  }

  private static void fillUp (int[] a)
  {
	// INSERT YOUR LOOP HERE
	Scanner stdin = new Scanner(System.in);
	for (int i = 1; i <= 6; i++)
		{
		System.out.print("Enter Value " + i + ": ");
		a[i] = stdin.nextInt();
		}
  }

  private static void printOut (int[] a)
  {
	// INSERT YOUR CODE HERE
	System.out.println("*** PrintOut of Array ***");
	for (int i = 1; i <= 6;  i++)
		{
			System.out.println(a[i]);
		}
	System.out.println("*************************");
  }
	
  private static int sumUp (int[] a)
  {
	// INSERT YOUR CODE HERE
	int sum = 0;
	for (int i = 1; i <= 6; i++)
		sum = sum + a[i];
		return sum;
  }

  private static int posCount (int[] a)
  {
	// INSERT YOUR CODE HERE
	int count = 0;
	for (int i = 0; i <= 6; i++)
	if (a[i] >= 0)
		count++;
	return count;



  }
}
