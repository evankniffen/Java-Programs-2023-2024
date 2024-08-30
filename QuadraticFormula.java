/**
 * public class QuadraticFormula
 *  
 * Author:  Evan Kniffen
 * Date:    09/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns the solutions to a quadratic polynomial. 

 */
 import java.util.Scanner;

 public class QuadraticFormula
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the values for a, b and c: ");
      int a = kb.nextInt();
      int b = kb.nextInt();
      int c = kb.nextInt();
      System.out.print("x = "+ (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a)+" and "+(-b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a));
      }
}