/**
 * public class CookieOrdersElseIf
 *  
 * Author:  Evan Kniffen
 * Date:    10/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that will determine the cost of cookies. 
 */
 import java.util.Scanner;

 public class CookieOrdersElseIf
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.println("********** Cookie Order ***********");
      System.out.println("Welcome to Mrs. Baker's Cookie Shop");
      System.out.println("1 to 4 boxes:          6.95 per box");
      System.out.println("5 to 9 boxes:          5.95 per box");
      System.out.println("10 to 15 boxes:        5.50 per box");
      System.out.println("16 or more boxes:      4.95 per box");
      System.out.print("Enter the number of boxes you wish to purchase: ");
      int boxes = kb.nextInt();
      double price;
      
      if (1 <= boxes && boxes <= 4)
      {
         price = 6.95;
         System.out.println("You bought "+boxes+" at $"+price+" per box.");
         System.out.println("Your totall bill is $"+ (price * boxes));
      }
      else if (5 <= boxes && boxes <= 9)
      {
         price = 5.95;
         System.out.println("You bought "+boxes+" at $"+price+" per box.");
         System.out.println("Your totall bill is $"+ (price * boxes));
      }
      else if (10 <= boxes && boxes <= 15)
      {
         price = 5.50;
         System.out.println("You bought "+boxes+" at $"+price+" per box.");
         System.out.println("Your totall bill is $"+ (price * boxes));
      }
      else if (boxes >= 16)
      {
         price = 4.95;
         System.out.println("You bought "+boxes+" at $"+price+" per box.");
         System.out.println("Your total bill is $"+ (price * boxes));
      }
      else 
         System.out.println("Your input is invalid");

      }
   }