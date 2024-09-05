package Programs;

import java.util.Scanner;

class Test { 
	static int factorial(int n) 
	{ 
		int res = 1, i; 
		for (i = 2; i <= n; i++) 
			res *= i; 
		return res; 
	} 

	// main method 
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		Scanner myObj = new Scanner(System.in);
		int inp;
		
		System.out.println("Enter your number");
		inp = myObj.nextInt();
		
		System.out.println("Factorial of " + inp + " is "
						+ factorial(inp)); 
	} 
}