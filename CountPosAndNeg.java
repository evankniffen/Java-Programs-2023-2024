/**
 * Primary java class: CountPosAndNeg
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

public class CountPosAndNeg
{
     public static void main (String [] args)
     {
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter a positive or negative number of 0 to quit: ");
     int x = kb.nextInt();
     int posTotal = 0;
     int negTotal = 0;
     while (x != 0)
     {
        if (x > 0)
           posTotal++;
        else if (x < 0)
           negTotal++;
        System.out.print("Enter a positive or negative number of 0 to quit: ");
        x = kb.nextInt();
     }
     if (x == 0)
        System.out.print("There were "+posTotal+" positive numbers and "+negTotal+" negative numbers");
     }   
}