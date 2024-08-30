/**
 * public class SquareWordRoot
 *  
 * Author:  Evan Kniffen
 * Date:    09/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns the square root of a word using indeces. 

 */
 import java.util.Scanner;

 public class SquareWordRoot
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your word: ");
      String word = kb.next();
      System.out.print("The \"square root\" of "+word+" is "+word.charAt((int)Math.sqrt(word.length())));
      }
   }