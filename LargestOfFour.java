/**
 * public class LargestOfFour
 *  
 * Author:  Evan Kniffen
 * Date:    10/30/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that will determine the largest of four numbers. 
 */
 import java.util.Scanner;

 public class LargestOfFour
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter four integer values: ");
      int x1 = kb.nextInt();
      int x2 = kb.nextInt();
      int x3 = kb.nextInt();
      int x4 = kb.nextInt();
      int greatest = x1;
      if (x1 >= x2 && x1 >= x3 && x1 >= x4)
         greatest = x1;
      else if (x2 >= x1 && x2 >= x3 && x2 >= x4)
         greatest = x2;
      else if (x3 >= x2 && x3 >= x1 && x3 >= x4)
         greatest = x3;
      else if (x4 >= x2 && x4 >= x1 && x4 >= x3)
         greatest = x4;
         
      System.out.print("The largest value of "+x1+", "+x2+", "+x3+", and "+x4+" is "+ greatest+".");
      }
   }