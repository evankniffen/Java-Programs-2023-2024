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
public class rounder
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the first temperature: ");
      double t1 = kb.nextDouble();
      double roundedt = (int)((t1 * 100) + .5) / 100;
      System.out.print(roundedt);
   }
}