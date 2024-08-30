/**
 * Primary java class: BooleanExpressionsWithLiterals
 *  
 * Author:  Evan Kniffen
 * Date:    10/13/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     tests the output of multiple boolean expressions.
 *
 */

public class BooleanExpressionsWithLiterals
{
   public static void main(String [] args)
   {    
        System.out.println(5 * 18 != 5 * 3 + 5 * 6); // true
        System.out.println(-13 == -13.0); // true
        System.out.println(-13 <= -13.0); // true
        System.out.println(15 % 5 == 0); // true
        System.out.println(7 + 9 / 2 >= 7 + 9 % 2); // true 
        System.out.println(7.1 + 9.5 != 16.6); // false
        System.out.println(5.2 < 6.1); // true
        System.out.println(100 % 2 == 0); // true
        System.out.println(0 % 2 == 0); // true
        System.out.println(100 % 3 == 0 ); // false
    }
}