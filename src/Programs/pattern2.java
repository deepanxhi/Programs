package Programs;

import java.util.Scanner;

public class pattern2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        //Taking rows value from the user
  
        System.out.println("Number of rows");
  
        int rows = sc.nextInt();
  
        System.out.println("Here is your pattern.");
 
        //Outer loop to handle numbers of rows
         
        for (int i = 1; i <= rows; i++)
        {
            //Inner loop handles number of columns
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
  
            //Control goes to next line after each row
             
            System.out.println();
        }
  
        //Close the resources
  
        sc.close();
    }

}

