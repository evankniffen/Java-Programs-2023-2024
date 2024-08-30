/**
 * Primary java class: DivisibleBy3And5
 *  
 * Author:  Evan Kniffen
 * Date:    11/3/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Pprint all of the numbers
 *      between 1 and 30 inclusive that are
 *      divisible by 3, divisible by 5 and divisible by
 *      both.
 *
 *
 */

public class DivisibleBy3And5
{
     public static void main (String [] args)
    {
     int i = 1;
     while (i <= 30)
     {
        if (i % 3 == 0 & i % 5 == 0)
           System.out.println(i+ " is divisible by both.");
        else if (i % 3 == 0)
           System.out.println(i+ " is divisible by 3.");
        else if (i % 5 == 0)
           System.out.println(i+ " is divisible by 5.");
        i++;
     }
     }
}