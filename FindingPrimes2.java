/**
 * Primary java class: FindingPrimes2
 *  
 * Author:  Evan Kniffen
 * Date:    11/17/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       This program find all the primes in between two numbers.
 *
 */ 
import java.util.Scanner;

public class FindingPrimes2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter two positive numbers: ");
      int first = kb.nextInt();
      int last = kb.nextInt();
      int start = 0, end = 0;
      boolean test = false;

      if (first < 0 || last < 0) {
         System.out.print("Numbers must be greater than zero: ");
         first = kb.nextInt();
         last = kb.nextInt();
         }
           
      if (first < last) {
         start = first;
         end = last;
         }
      else if (first > last) {
         start = last;
         end = first; 
         }
      if (start == 1) 
         start++; 
         
      while (!test && first > 0 && last > 0) {
         
      for (int num = start; num <= end; num++)
      {
         int divisor = 2;
         boolean isPrime = true;
         
         while (isPrime && divisor <= Math.sqrt(num))
         {
         if (num % divisor == 0)
            isPrime = false;
         divisor++;
            }
            
         if (isPrime)
            System.out.print(num + " ");
         }
         test = true;
         }
   }
}