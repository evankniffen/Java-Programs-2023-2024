
/**
* class @@@@@@@@@
*
* Author1: your name here
* Date: 11/28/2023
* Course: Computer Science I AP
*
* Summary of file:
*  Prints out a list of Fibonacci numbers based on two limits set by the user. 
*
*
*/
import java.util.*;
public class FibonacciNew {

public static void main(String[] args) {

   Scanner kb = new Scanner(System.in);
   System.out.print("Enter the starting value: ");
   int start = kb.nextInt();
   System.out.print("Enter the ending value: ");
   int end = kb.nextInt();
   int previous = 0, current = 1, next = 1;  
   boolean found = false;
   
   if(start == 0)
      System.out.print(previous + ", ");
      
     while (current <= end) {
            if (current >= start && found) {
                System.out.print(", ");
            } else if (current >= start) {
                System.out.print(current);
                found = true;
            }

            next = previous + current;
            previous = current;
            current = next;
        }

        if (!found) {
            System.out.println("None found.");
        } else {
            System.out.println();
        }

        kb.close();
    }
}