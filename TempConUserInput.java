/**
 * public class TempConUserInput
 *  
 * Author:  Evan Kniffen
 * Date:    09/07/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Finds the temp. in Celcius when given a temp. in Fahrenheit.
 *
 */
 import java.util.Scanner;
 
 public class TempConUserInput
 {
   public static void main(String [] args)
   {
      Scanner ek = new Scanner(System.in);

      double fahrenheit, celcius;
      System.out.println("Fahrenheit to Celcius");
      System.out.print("Enter the temperature in Fahrenheit: ");
      fahrenheit = ek.nextDouble();
      celcius = (fahrenheit - 32.0) * (5.0/9.0);
      System.out.println(fahrenheit + " degrees Fahrenheit = "+ celcius +" degrees Celcius");
      System.out.println();
      }
}      