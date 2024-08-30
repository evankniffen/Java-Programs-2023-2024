/**
 * Primary java class: CountDown3
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

public class CountDown3
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in);
   int big, small; 
   System.out.print("First number: ");
   int num2 = kb.nextInt();
   System.out.print("Second number: ");
   int num1 = kb.nextInt();   
   
   if (num1 > num2){
      big = num1;
      small = num2;
      }
   else if (num2 > num1){
      big = num2;
      small = num1;
      }
    else 
      return;
   for(int i = big; i <= big && i >= small; i--)
      System.out.print(i+ " ");
   }
}