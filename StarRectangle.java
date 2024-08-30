/**
 * Primary java class: StarRectangle
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       This program inputs the side lengths and outputs a square and/or rectangle of stars
 *
 */  

import java.util.Scanner;
public class StarRectangle
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num1 = kb.nextInt();
      System.out.print("Enter a number: ");
      int num2 = kb.nextInt();
      System.out.println("This is a " + num1 + " by " + num2 + " rectangle of stars:");

      for (int row = 0; row < num1; row++) {
         for (int col = 0; col < num2; col++)
            System.out.print("*");
         System.out.println();
      }
}
}
