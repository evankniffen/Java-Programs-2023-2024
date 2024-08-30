/**
 * Primary java class: XSquare2
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints an array of squares.
 *
 */
import java.util.Scanner;

public class XSquare2
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter n: ");
   int n = kb.nextInt(); 
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
         System.out.print("X");
      System.out.println();
   }
   }
}
