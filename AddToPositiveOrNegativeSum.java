/**
 * Primary java class: AddToPositiveOrNegativeSum
 *  
 * Author:  Evan Kniffen
 * Date:    10/19/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     finds the value of the sums of a set of positive and negative numbers.
 *
 */
import java.util.Scanner;

public class AddToPositiveOrNegativeSum
{
   public static void main(String [] args)
   {    
      Scanner kb = new Scanner(System.in);
      int posSum = 0, negSum = 0, x;
      for (int i = 1; i <= 10; i++)
      {
         System.out.print("Enter a number: ");
         x = kb.nextInt();
         if (x > 0)
            posSum += x;
         if (x < 0)
            negSum += x;
      }
      System.out.println("The sum of the positive numbers is "+posSum+".");
      System.out.print("The sum of the negative numbers is "+negSum+".");
    }
}