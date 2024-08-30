/**
 * Primary java class: NegativeExponent
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

public class NegativeExponent
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the base: ");
   int base = kb.nextInt();
   System.out.print("Enter the exponent: ");
   int exp = kb.nextInt();
   double num = base;
   
   for(int i = 1; i < Math.abs(exp); i++)
      num *= base;
      
   if(exp < 0)
      num = 1 / num;
  
   System.out.print(base + " ^ " + exp + " = " + num);
   }
}