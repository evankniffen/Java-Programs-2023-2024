/**
 * Primary java class: PrintTheLetters
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints a string in lines.
 *
 */
import java.util.Scanner;

public class PrintTheLetters
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the word: ");
   String str = kb.next(); 
   for (int i = 0; i < str.length(); i++) 
      System.out.println(str.substring(i, i + 1));
   }
}
