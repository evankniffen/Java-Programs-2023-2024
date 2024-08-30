/**
 * Primary java class: CountDown
 *  
 * Author:  Evan Kniffen
 * Date:    11/13/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that allows the user to enter two whole numbers. The first number should be smaller than the second number. Print all of the numbers from the second number down to the first number. Print
 *       each number on same line. If the first number is larger than the second number,
 *       then the program should not print anything. 
 *
 */
import java.util.Scanner;

public class CountDown
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in);
   System.out.print("First number: ");
   int num2 = kb.nextInt();
   System.out.print("Second number: ");
   int num1 = kb.nextInt();   
   
   if (num1 > num2)
   {
   for(int i = num1; i <= num1 && i >= num2; i--)
      System.out.print(i+ " ");
   }
   }
}