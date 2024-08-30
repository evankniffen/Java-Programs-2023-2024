/**
 * public class Distance
 *  
 * Author:  Evan Kniffen
 * Date:    09/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns the distance between two points. 

 */
 import java.util.Scanner;

 public class Distance
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the coordinates of the first point (x1,y1): ");
      int x1 = kb.nextInt();
      int y1 = kb.nextInt();
      System.out.print("Enter the coordinates of the second point (x2,y2): ");
      int x2 = kb.nextInt();
      int y2 = kb.nextInt();
      System.out.print("The distance between ("+x1+","+y1+") and ("+x2+","+y2+") is "+ Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2)));
      }
}