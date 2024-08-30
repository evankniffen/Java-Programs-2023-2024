
/**
 * public class TemperatureDifference
 *  
 * Author:  Evan Kniffen
 * Date:    09/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns a set of substrings based on two given names. 
 */
import java.util.Scanner;
public class TemperatureDifference
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the first temperature: ");
      int t1 = kb.nextInt();
      System.out.print("Enter the second temperature: ");
      int t2 = kb.nextInt();
      System.out.print("The temperature changed " + Math.abs(t1-t2) + " degrees.");

   }
}
