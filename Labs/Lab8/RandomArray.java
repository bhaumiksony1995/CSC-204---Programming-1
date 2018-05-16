import java.util.*;

public class RandomArray
{
        public static void main(String[] args)
		{
			int random[] = new int [50];
			for (int i =0; i<50; i++)
				{
					random[i] = (int) (Math.random() * 50 + 10);
					System.out.print(random[i] + " ");
					if ((i + 1) % 10 == 0)
						System.out.println();
				}
		}
}
