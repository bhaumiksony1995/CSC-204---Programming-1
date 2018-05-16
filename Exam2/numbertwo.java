import java.util.*;

public class numbertwo
        {
                public static void main(String args[])
                        {
				int num = 11;
				double result = 2.0;
				char ch = 'F';
				String word = "canada";
				boolean p = false, q = true, r = true;

				int resulta = 404 / 10 * 10 + 1;
				System.out.println("A" + resulta);

				int resultb = 7 + 13 / 5 + 3 - num % 6;
				System.out.println("B" + resultb);

				int resultc = (int) (Math.sqrt(100.0) * result + 550e-2);
				System.out.println("C" + resultc);

				

				char resultf = (char) (ch - 'A' + 'a');
				System.out.println("F" + resultf);

				String resulti = " " + num + num;
				System.out.println("i" + resulti);

				boolean resultj = (word.indexOf("canada") == -1);
				System.out.println("J" + resultj);

				int resultk = word.trim().length();
				System.out.println("K" + resultk);

				String resultl = word.substring(1, word.indexOf("ada"));
				System.out.println("L" + resultl);

				int resultm = word.lastIndexOf("a", 4);
				System.out.println("M" + resultm);

				//String resultn = word.toUppercase().charAt(2);
				//System.out.println(resultn);

				boolean resulto = word.compareTo("mexico") > 0;
				System.out.println("O" + resulto);

			}
	}

				
				

