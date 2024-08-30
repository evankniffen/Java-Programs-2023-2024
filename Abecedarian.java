/**
 * Primary java class: Abecedarian
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints if a string is an abecedarian word.
 *
 */
import java.util.Scanner;

public class Abecedarian
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the word: ");
   String w = kb.next();    
   boolean is = true;
   int i = 0;
   while (is && i < w.length() - 1) {
      String c1 = w.substring(i, i + 1);
      String c2 = w.substring(i + 1, i + 2);
      if (c1.compareTo(c2) > 0)
         is = false;
      i++;
      }
   if (is)
      System.out.print(w + " is an abecedarian word.");
   else
      System.out.print(w + " is not an abecedarian word.");

   }
}
