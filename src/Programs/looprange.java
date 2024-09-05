package Programs;

import java.util.Scanner;

public class looprange {
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your starting number");
		int a= myObj.nextInt();
		System.out.println("Enter your end number");
		int b=myObj.nextInt();
		for(int i=a; i<=b; i++)
		{
			System.out.println("Number iteration at "+i);
		}
	}

}
