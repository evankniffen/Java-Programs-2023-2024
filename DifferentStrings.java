/**
 * Primary java class: DifferentStrings
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that states if a string is a palindrome.
 *
 */
import java.util.Scanner;

public class DifferentStrings
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter a word: ");
   String str = kb.next();
   String pal = ""

   for (int i = str.length() - 1; i >= 0; i--)
      pal += str.substring(i - 1, i);
      
   if (pal.equals(str))
      System.out.print(str + " is a palindrome.");
   else
      System.out.print(str + " is not a palindrome.")
   }
}
