package Programs;
import java.util.Scanner;

public class pattern5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        //Taking rows value from the user
  
        System.out.println("Number of rows.");
  
        int rows = sc.nextInt();
  
        System.out.println("Here is your pattern.");
  
        //Printing upper half of the pattern
  
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            } 
  
            System.out.println();
        } 
  
        //Printing lower half of the pattern 
  
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }
  
        //Closing the resources
  
        sc.close();
    }
}

