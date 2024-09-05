package Programs;
import java.util.Scanner;
public class ifelsenumber {
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your number");
		int a= myObj.nextInt();

		if(a==0)
		{
			System.out.println("zero");
		}
		else if(a>0)
		{
			System.out.println("Positive number");
		}
		else
			System.out.println("Negative number");
	}

}
