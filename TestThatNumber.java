/**
 * Primary java class: TestThatNumber
 *  
 * Author:  Evan Kniffen
 * Date:    10/19/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     tests the output of multiple boolean expressions.
 *
 */
import java.util.Scanner;

public class TestThatNumber
{
   public static void main(String [] args)
   {    
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter an integer ==> ");
      int x = kb.nextInt();
      System.out.println();
      if (x > 0)
         System.out.println(x + " is a positive number.");
      if (x == 0)
         System.out.println(x + " is zero.");
      if (x < 0)
         System.out.println(x + " is a negative number.");
      if (x >= 0)
         System.out.println(x + " is a nonnegative number.");
      if (x <= 0)
         System.out.println(x + " is a nonpositive number.");
      if (x % 2 == 0)
         System.out.println(x + " is an even number.");
      if (x % 2 != 0)
         System.out.println(x + " is an odd number.");
      if (x % 10 == 0)
         System.out.println(x + " is divisible by 10.");
      if (x % 10 != 0)
         System.out.println(x + " is not divisible by 10.");
    }
}