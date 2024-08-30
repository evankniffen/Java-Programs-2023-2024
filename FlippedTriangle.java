/**
 * Primary java class: FlippedTriangle
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints a flipped triangle of asterisks.
 *
 */
import java.util.Scanner;

public class FlippedTriangle
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter n: ");
   int n = kb.nextInt(); 
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < 6 - i; j++)
         System.out.print("*");
      System.out.println();
   }
   }
}
