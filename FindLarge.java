/**
 * Primary java class: FindLarge
 *  
 * Author:  Evan Kniffen
 * Date:    10/19/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     finds the largest value from two under-inputted values.
 *
 */
import java.util.Scanner;

public class FindLarge
{
   public static void main(String [] args)
   {    
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int x = kb.nextInt();
      System.out.print("Enter the second number: ");
      int y = kb.nextInt();
      if (x > y)
         System.out.println(x + " is larger than "+y+".");
      if (x < y)
         System.out.println(y + " is larger than "+x+".");
      if (x == y)
         System.out.println(x + " and "+y+" are equal.");
    }
}