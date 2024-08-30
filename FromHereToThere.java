/**
 * Primary java class: FromHereToThere
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

public class FromHereToThere
{
     public static void main (String [] args)
     {
     Scanner kb = new Scanner(System.in);
     System.out.print("First number? ");
     int here = kb.nextInt();
     System.out.print("Second number? ");
     int there = kb.nextInt();
     int i = here;
     while (i <= there)
     {
        System.out.println(i);
        i++;
     }
     }
}