import java.util.*;

public class distance
{
        public static void main(String[] args)
        {
		
		Scanner stdin = new Scanner(System.in);
			
		System.out.print ("x1 of P = ");
		double X1 = stdin.nextInt();

		System.out.print ("x2 of P = ");
		double X2 = stdin.nextInt();
		System.out.println("");

		System.out.print ("y1 of P = ");
		double Y1 = stdin.nextInt();

		System.out.print ("y2 of P = ");
		double Y2 = stdin.nextInt();
		System.out.println("");
		
		double distance = Math.sqrt(((X1-X2) * (X1-X2)) + (((Y1-Y2) * (Y1-Y2))));

		System.out.println ("The distance between (" + X1 + "," + X2 +") and (" + Y1 + "," + Y2 + ") is " + distance + "."); 
	}
}

