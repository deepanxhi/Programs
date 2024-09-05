package Programs;

import java.util.Scanner;

public class factorial {
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		int inp;
		
		System.out.println("Enter your number");
		inp = myObj.nextInt();
		if(inp == 1 || inp == 0)
		{
			System.out.println("Factorial = 1");
		}
		else
		{
			int a=1;
			for(int i = 1; i<=inp; i++)
			{
			a = a*i;
			}
			System.out.println("Factorial is "+a);
			
		
		}
				
	}

}
