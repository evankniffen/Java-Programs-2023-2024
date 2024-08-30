/**
 * public class UnitsOfMeasurement
 *  
 * Author:  Evan Kniffen
 * Date:    10/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Allows the user to convert english measurements to metric. 

 */
 import java.util.Scanner;

 public class UnitsOfMeasurement
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.println("(1) to convert from inches to centimeters,");
      System.out.println("(2) to convert from feet to meters,");
      System.out.println("(3) to convert from miles to kilometers,");
      System.out.println("(4) to convert from pounds to kilograms.");
      System.out.print("Enter your number: ");
      int num = kb.nextInt();
      if (num == 1)
      {
         System.out.print("Enter the number of inches to be converted to centimeters: ");
         double c1 = kb.nextInt();
         c1 *= 2.54;
         System.out.println(c1 + " centimeters");
         }
      else if (num == 2)
      {
         System.out.print("Enter the number of feet to be converted to meters: ");
         double c2 = kb.nextInt();
         System.out.println(c2 + " meters");
         c2 *= .3048;
         }
      else if (num == 3)
      {
         System.out.print("Enter the number of miles to be converted to kilometers: ");
         double c3 = kb.nextInt();
         c3 *= 1.60934;
         System.out.println(c3 + " kilometers");
         }
      else if (num == 4)
      {
         System.out.print("Enter the number of pounds to be converted to kilograms: ");
         double c4 = kb.nextInt();
         c4 *= .453592;
         System.out.println(c4 + " kilograms");
         }
      else
         System.out.println("The number entered is invalid.");
      }
   }