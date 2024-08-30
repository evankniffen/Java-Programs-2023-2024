/*
 * Primary java class: StarTriangle
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       This program inputs the side length and outputs an isosceles triangle of stars.
 *
 */
import java.util.Scanner;

public class StarTriangle
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int side = kb.nextInt();
      System.out.println("This is a " + side + " by " + side + " triangle of stars:");

      for (int x = 1; x <= side; x++) {
         for (int y = 1; y <= x; y++) {
            System.out.print("*");
            }
         System.out.println();
         }         
      }
}
