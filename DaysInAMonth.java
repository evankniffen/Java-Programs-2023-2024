/**
 * public class DaysInAMonth
 *  
 * Author:  Evan Kniffen
 * Date:    10/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Outputs the month as a String and the number of days in that month. 

 */
 import java.util.Scanner;

 public class DaysInAMonth
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the number of your month (1-12): ");
      int month = kb.nextInt();
      if (month == 1)
         System.out.print("January has 31 days.");
      else if (month == 2)
         System.out.print("February has 28 days.");
      else if (month == 3)
         System.out.print("March has 31 days.");
      else if (month == 4)
         System.out.print("April has 30 days.");
      else if (month == 5)
         System.out.print("May has 31 days.");
      else if (month == 6)
         System.out.print("June has 30 days.");
      else if (month == 7)
         System.out.print("July has 31 days.");
      else if (month == 8)
         System.out.print("August has 31 days.");
      else if (month == 9)
         System.out.print("September has 30 days.");
      else if (month == 10)
         System.out.print("October has 31 days.");
      else if (month == 11)
         System.out.print("November has 30 days.");
      else if (month == 12)
         System.out.print("December has 31 days.");
      else
         System.out.println("The number entered is invalid.");
      }
   }