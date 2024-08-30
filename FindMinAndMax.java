/**
 * Primary java class: FindMinAndMax
 *  
 * Author:  Evan Kniffen
 * Date:    11/3/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Prints the largest number that was entered and the smallest number that was entered.
 *
 */

import java.util.Scanner;

public class FindMinAndMax
{
     public static void main (String [] args)
     {
        Scanner kb = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;

        while (i < 5) {
            System.out.print("Number: ");
            int num = kb.nextInt();

            if (num < min)
                min = num;
                
            if (num > max)
                max = num;
                
            i++;
        }

        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
     }
}