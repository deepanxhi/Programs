package Programs;
import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("Enter number of rows");
 
        int rows = sc.nextInt();
 
        System.out.println("Here is your pattern.");
 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        //Close the resources
 
        sc.close();
    }
}