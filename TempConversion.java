/**
 * public class TempConversion
 *  
 * Author:  Evan Kniffen
 * Date:    09/04/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Finds the temp. in Celcius when given a temp. in Fahrenheit.
 *
 */
 public class TempConversion 
 {
   public static void main(String [] args)
   {
      double fahrenheit, celcius;
      fahrenheit = 86.0;
      celcius = (fahrenheit - 32.0) * (5.0/9.0);
      System.out.println("Temperature in Fahrenheit: "+fahrenheit);
      System.out.print("Temperature in Celcius: "+celcius);
      }
}      
