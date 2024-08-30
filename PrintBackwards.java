/**
 * Primary java class: PrintBackwards
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints a string backwards.
 *
 */
import java.util.Scanner;

public class PrintBackwards
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter a word: ");
   String str = kb.next(); 
   System.out.print(str + " printed backwards is: ");
   for (int i = str.length() - 1; i >= 0; i--) 
      System.out.print(str.substring(i, i + 1));
   }
}
