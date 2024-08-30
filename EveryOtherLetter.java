/**
 * Primary java class: EveryOtherLetter
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that prints a string's every other letter.
 *
 */
import java.util.Scanner;

public class EveryOtherLetter
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the word: ");
   String str = kb.next(); 
   String sub = "";
   for (int i = 0; i < str.length(); i+=2) {
      sub = str.substring(i, i + 1);
      System.out.print(sub);
      }
   }
}
