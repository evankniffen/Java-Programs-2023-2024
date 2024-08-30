/**
 * public class TotalWithTaxUserInput
 *  
 * Author:  Evan Kniffen
 * Date:    09/29/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns a tax adjusted price. 

 */
import java.util.Scanner;
public class TotalWithTaxUserInput
{
   public static void main(String[] args)
   {
      final double TAXRATE=0.0825;
      double totalCost,tax,price;
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the price: ");
      price = kb.nextDouble();
      tax=price*TAXRATE;
      totalCost=price+tax;
      System.out.println("Price: $"+price);
      System.out.println("Sales Tax: $"+tax);
      System.out.println("Total: $"+totalCost);
   }
}
