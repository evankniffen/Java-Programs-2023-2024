/**
 * Primary java class: CountDown2
 *  
 * Author:  Evan Kniffen
 * Date:    11/13/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that allows the user to enter two whole numbers. The first number should be smaller than the second number. Print all of the numbers from the second number down to the first number. Print
 *       each number on same line.
 *
 */
import java.util.Scanner;

public class CountDown2
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in);
   System.out.print("First number: ");
   int num2 = kb.nextInt();
   System.out.print("Second number: ");
   int num1 = kb.nextInt();   
   
   while (num1 > num2)
   {
   for(int i = num1; i <= num1 && i >= num2; i--)
      System.out.print(i+ " ");
      break;
   }
   while (num1 < num2)
   {
      System.out.println("The second number must be larger than the first.");
      System.out.print("First number: ");
      num2 = kb.nextInt();
      System.out.print("Second number: ");
      num1 = kb.nextInt();
      }
      for(int i = num1; i <= num1 && i >= num2; i--)
         System.out.print(i+ " ");  
   }
}