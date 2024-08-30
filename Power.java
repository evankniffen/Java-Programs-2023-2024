/**
 * Primary java class: Power
 *  
 * Author:  Evan Kniffen
 * Date:    11/13/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints an exponent to a base, both user-inputted, using for loops.
 *
 */
import java.util.Scanner;

public class Power
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the base: ");
   int base = kb.nextInt();
   System.out.print("Enter the exponent: ");
   int exp = kb.nextInt();
   int num = base;
   
   for(int i = 1; i < exp; i++)
      num *= base;

   System.out.print(base + " ^ " + exp + " = " + num);
   }
}