
/**
 * public class FindThePower
 *  
 * Author:  Evan Kniffen
 * Date:    09/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns the power of a given base and exponent.
 */
import java.util.Scanner;
public class FindThePower
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the base: ");
      int base = kb.nextInt();
      System.out.print("Enter the exponent: ");
      int exponent = kb.nextInt();
      System.out.print(base+"^"+exponent+" = "+ Math.pow(base, exponent));
   }
}
