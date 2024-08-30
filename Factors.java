/**
 * Primary java class: Factors
 *  
 * Author:  Evan Kniffen
 * Date:    11/3/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Prints the integers between two user-inputted values.
 *
 */

import java.util.Scanner;

public class Factors
{
     public static void main (String [] args)
     {
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter your number: ");
     int x = kb.nextInt();
     int i = 1;
     System.out.print("The factors of "+x+" are: ");
     while (i <= x)
     {
        if (x % i == 0)
           System.out.print(i + " ");
        i++;
     }
     }
}