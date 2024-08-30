/**
 * public class TotalWithTax
 *  
 * Author:  Evan Kniffen
 * Date:    09/04/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Finds the sales tax and final price based on the original cost and tax rate.
 *
 */
 public class TotalWithTax
 {
   public static void main(String [] args)
   {
      final double TAXRATE = 0.0825;
      double price, tax, totalCost;
      price = 52.75;
      tax = price * TAXRATE;
      totalCost = price + tax;
      System.out.println("Price: $"+price);
      System.out.println("Sales Tax: $"+tax);
      System.out.print("Total: $"+totalCost);
      }
}     
      