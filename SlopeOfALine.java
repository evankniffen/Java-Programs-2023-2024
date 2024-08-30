/**
 * public class SlopeOfALine
 *  
 * Author:  Evan Kniffen
 * Date:    10/25/233
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Finds the slope of a line for 2 points.
 *
 */
 import java.util.Scanner;
 
 public class SlopeOfALine
 {
   public static void main(String [] args)
   {
      Scanner ek = new Scanner(System.in);

      int x1, x2, y1, y2;
      System.out.print("Enter one point:");
      x1 = ek.nextInt();
      y1 = ek.nextInt();
      System.out.print("Enter another point: ");
      x2 = ek.nextInt();
      y2 = ek.nextInt();
      if (x2 - x1 == 0)
         System.out.println("the line is a vertical line and the slope is undefined.");
      else
         {
         double slope = ((double)(y2 - y1)) / ((double)(x2 - x1));
         System.out.println("The slope of the line is "+ slope + ".");
         }
      }
}      