/**
 * public class RightTriangle
 *  
 * Author:  Evan Kniffen
 * Date:    10/30/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that will determine if a trio of numbers can form a triangle. 
 */
 import java.util.Scanner;

 public class RightTriangle
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter three integer sides of a traingle: ");
      int x1 = kb.nextInt();
      int x2 = kb.nextInt();
      int x3 = kb.nextInt();
      int greatest = 0, side2 = 0, side1 = 0;
      if (x1 >= x2 && x1 >= x3)
      {
         greatest = x1;
         side1 = x2;
         side2 = x3;
         }
      else if (x2 >= x1 && x2 >= x3)
      {
         greatest = x2;
         side1 = x1;
         side2 = x3;
         }
      else if (x3 >= x2 && x3 >= x1)
      {
         greatest = x3;
         side1 = x1;
         side2 = x2;
         }
      
      if (side1 + side2 > greatest)
      {
         if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(greatest, 2))
            System.out.println("The side lengths of "+side1+", "+side2+", and "+greatest+" form a right traingle.");
         else
            System.out.println("The side lengths of "+side1+", "+side2+", and "+greatest+" form a triangle but is not a right traingle.");
      }
      else
         System.out.println("The side lengths of "+side1+", "+side2+", and "+greatest+" do not form a traingle");
      }
   }