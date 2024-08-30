/**
 * Primary java class: CountTheVowels
 *  
 * Author:  Evan Kniffen
 * Date:    11/16/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that counts a string's vowels.
 *
 */
import java.util.Scanner;

public class CountTheVowels
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter the word: ");
   String str = kb.next(); 
   String sub = "";
   int count = 0;
   for (int i = 0; i < str.length(); i++) {
      sub = str.substring(i, i + 1);
      if (sub.equals("a") || sub.equals("i") || sub.equals("e") || sub.equals("o") || sub.equals("u")) {
         System.out.print(sub + " ");
         count++;
         }
      }
   System.out.println();
   System.out.print("Total vowels: "+count);
   }
}
