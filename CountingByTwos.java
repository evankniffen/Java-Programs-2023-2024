/**
 * Primary java class: CountingByTwos
 *  
 * Author:  Evan Kniffen
 * Date:    11/3/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Prints the even numbers from 2 to 20.
 *
 */

public class CountingByTwos
{
     public static void main (String [] args)
     {
     int i = 2;
     while (i <= 20)
     {
        System.out.print(i+ " ");
        i += 2;
     }
     }
}