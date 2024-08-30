/**
 * Primary java class: MultiplicationTable
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints a multiplication table from 1 to 9.
 *
 */   
public class MultiplicationTable
{
   public static void main (String [] args)
   {
   for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
      if (i * j < 10)
         System.out.print(" " + i * j + " ");
      else
         System.out.print(i * j + " ");
         }
      System.out.println();
   }
   }
}
   