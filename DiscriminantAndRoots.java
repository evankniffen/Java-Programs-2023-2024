/**
 * public class DiscriminantAndRoots
 *  
 * Author:  Evan Kniffen
 * Date:    10/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that will determine the number and
 *       type of roots for a quadratic equation, given the coefficients a, b, and c. 
 */
 import java.util.Scanner;

 public class DiscriminantAndRoots
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the coefficients for a quadratic equation: ");
      int a = kb.nextInt();
      int b = kb.nextInt();
      int c = kb.nextInt();
      double d = Math.pow(b,2) - (4 * a * c);
      if (d > 0)
         System.out.println(a+"x^2 + "+b+"x + "+c+" has 2 real roots.");
      else if (d < 0)
         System.out.println(a+"x^2 + "+b+"x + "+c+" has 2 imaginary roots.");
      else
         System.out.println(a+"x^2 + "+b+"x + "+c+" has 1 real root.");
      }
   }