/**
 * Primary java class: NumericComparisons
 *  
 * Author:  Evan Kniffen
 * Date:    10/13/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     tests the output of multiple boolean expressions using a single variable, then comapres two variables using mod. 
 *
 */
import java.util.Scanner;

public class NumericComparisons
{
   public static void main(String [] args)
   {   
      Scanner kb = new Scanner(System.in);
      int num1, num2;
      boolean isOdd, isEven, isZero, isNegative, isPositive, isNonnegative, isNonpositive, isFactor, isMultiple;
      System.out.print("Enter num1 ==>");
      num1 = kb.nextInt();
      isOdd = num1 % 2 != 0;
      System.out.println(num1 + " is odd: " + isOdd);
      isEven = num1 % 2 == 0;
      System.out.println(num1 + " is even: " + isEven);
      isZero = num1 == 0;
      System.out.println(num1 + " is zero: " + isZero);
      isPositive = num1 > 0;
      System.out.println(num1 + " is positive: " + isPositive);
      isNegative = num1 < 0;
      System.out.println(num1 + " is negative: " + isNegative);
      isNonnegative = num1 >= 0;
      System.out.println(num1 + " is nonnegative: " + isNonnegative); 
      isNonpositive = num1 <= 0;
      System.out.println(num1 + " is nonpositive: " + isNonpositive);
      System.out.print("Enter num2 ==>");
      num2 = kb.nextInt();
      isFactor = num2%num1 == 0;
      System.out.println(num1 + " is a factor of "+num2+": " + isFactor);
      isMultiple = num1%num2 == 0;
      System.out.println(num1 + " is a multiple of "+num2+": " + isMultiple);
   }
}

